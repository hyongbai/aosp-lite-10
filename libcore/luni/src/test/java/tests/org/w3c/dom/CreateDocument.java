/*
 This Java source file was generated by test-to-java.xsl
 and is a derived work from the source document.
 The source document contained the following notice:



 Copyright (c) 2001 World Wide Web Consortium,
 (Massachusetts Institute of Technology, Institut National de
 Recherche en Informatique et en Automatique, Keio University).  All
 Rights Reserved.  This program is distributed under the W3C's Software
 Intellectual Property License.  This program is distributed in the
 hope that it will be useful, but WITHOUT ANY WARRANTY; without even
 the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR
 PURPOSE.

 See W3C License http://www.w3.org/Consortium/Legal/ for more details.


 */

package tests.org.w3c.dom;

import java.util.ArrayList;
import java.util.List;

import org.w3c.dom.DOMImplementation;
import org.w3c.dom.Document;
import org.w3c.dom.DocumentType;
import org.w3c.dom.DOMException;

import javax.xml.parsers.DocumentBuilder;

/**
 * The "createDocument(namespaceURI,qualifiedName,doctype)" method for a
 * DOMImplementation should raise NAMESPACE_ERR DOMException if parameter
 * qualifiedName is malformed.
 *
 * Retrieve the DOMImplementation on the XMLNS Document. Invoke method
 * createDocument(namespaceURI,qualifiedName,doctype) on the retrieved
 * DOMImplementation with namespaceURI being the literal string
 * "http://www.ecommerce.org/", qualifiedName as "prefix::local", and doctype as
 * null. Method should raise NAMESPACE_ERR DOMException.
 *
 * @author NIST
 * @author Mary Brady
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-258A00AF')/constant[@name='NAMESPACE_ERR'])">http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('ID-258A00AF')/constant[@name='NAMESPACE_ERR'])</a>
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#Level-2-Core-DOM-createDocument">http://www.w3.org/TR/DOM-Level-2-Core/core#Level-2-Core-DOM-createDocument</a>
 * @see <a
 *      href="http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('Level-2-Core-DOM-createDocument')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='NAMESPACE_ERR'])">http://www.w3.org/TR/DOM-Level-2-Core/core#xpointer(id('Level-2-Core-DOM-createDocument')/raises/exception[@name='DOMException']/descr/p[substring-before(.,':')='NAMESPACE_ERR'])</a>
 */
public final class CreateDocument extends DOMTestCase {

    DOMDocumentBuilderFactory factory;

    DocumentBuilder builder;

    protected void setUp() throws Exception {
        super.setUp();
        try {
            factory = new DOMDocumentBuilderFactory(DOMDocumentBuilderFactory
                    .getConfiguration1());
            builder = factory.getBuilder();
        } catch (Exception e) {
            fail("Unexpected exception" + e.getMessage());
        }
    }

    protected void tearDown() throws Exception {
        factory = null;
        builder = null;
        super.tearDown();
    }

    /**
     * Runs the test case.
     *
     * @throws Throwable
     *             Any uncaught exception causes test to fail
     */
    public void testCreateDocument1() throws Throwable {
        String namespaceURI = "http://www.ecommerce.org/";
        String malformedName = "prefix::local";
        Document doc;
        DocumentType docType = null;

        DOMImplementation domImpl;

        doc = (Document) load("staffNS", builder);
        domImpl = doc.getImplementation();

        boolean success = false;
        try {
            domImpl.createDocument(namespaceURI, malformedName, docType);
        } catch (DOMException ex) {
            success = (ex.code == DOMException.NAMESPACE_ERR);
        }
        assertTrue("throw_NAMESPACE_ERR", success);

    }
    public void testCreateDocument2() throws Throwable {
        String namespaceURI = null;

        String qualifiedName = "k:local";
        Document doc;
        DocumentType docType = null;

        DOMImplementation domImpl;

        doc = (Document) load("staffNS", builder);
        domImpl = doc.getImplementation();

        boolean success = false;
        try {
            domImpl.createDocument(namespaceURI, qualifiedName, docType);
        } catch (DOMException ex) {
            success = (ex.code == DOMException.NAMESPACE_ERR);
        }
        assertTrue("throw_NAMESPACE_ERR", success);

    }

//    public void testCreateDocument3() throws Throwable {
//        String namespaceURI = "http://www.ecommerce.org/schema";
//        String qualifiedName = "namespaceURI:x";
//        Document doc;
//        DocumentType docType;
//        DOMImplementation domImpl;
//
//        doc = (Document) load("staffNS", builder);
//        docType = doc.getDoctype();
//        domImpl = doc.getImplementation();
//
//        boolean success = false;
//        try {
//            domImpl.createDocument(namespaceURI, qualifiedName, docType);
//        } catch (DOMException ex) {
//            success = (ex.code == DOMException.WRONG_DOCUMENT_ERR);
//        }
//        assertTrue("throw_WRONG_DOCUMENT_ERR", success);
//
//    }

//    public void testCreateDocument4() throws Throwable {
//        String namespaceURI = "http://www.ecommerce.org/schema";
//        String qualifiedName = "namespaceURI:x";
//        Document doc;
//        DocumentType docType;
//        DOMImplementation domImpl;
//        Document aNewDoc;
//        doc = (Document) load("staffNS", builder);
//        aNewDoc = (Document) load("staffNS", builder);
//        docType = doc.getDoctype();
//        domImpl = aNewDoc.getImplementation();
//
//        boolean success = false;
//        try {
//            aNewDoc = domImpl.createDocument(namespaceURI, qualifiedName,
//                    docType);
//        } catch (DOMException ex) {
//            success = (ex.code == DOMException.WRONG_DOCUMENT_ERR);
//        }
//        assertTrue("throw_WRONG_DOCUMENT_ERR", success);
//
//    }
    public void testCreateDocument5() throws Throwable {
        String namespaceURI = "http://www.ecommerce.org/schema";
        String qualifiedName;
        Document doc;
        DocumentType docType = null;

        DOMImplementation domImpl;

        List<String> illegalQNames = new ArrayList<String>();
        illegalQNames.add("namespaceURI:{");
        illegalQNames.add("namespaceURI:}");
        illegalQNames.add("namespaceURI:~");
        illegalQNames.add("namespaceURI:'");
        illegalQNames.add("namespaceURI:!");
        illegalQNames.add("namespaceURI:@");
        illegalQNames.add("namespaceURI:#");
        illegalQNames.add("namespaceURI:$");
        illegalQNames.add("namespaceURI:%");
        illegalQNames.add("namespaceURI:^");
        illegalQNames.add("namespaceURI:&");
        illegalQNames.add("namespaceURI:*");
        illegalQNames.add("namespaceURI:(");
        illegalQNames.add("namespaceURI:)");
        illegalQNames.add("namespaceURI:+");
        illegalQNames.add("namespaceURI:=");
        illegalQNames.add("namespaceURI:[");
        illegalQNames.add("namespaceURI:]");
        illegalQNames.add("namespaceURI:\\");
        illegalQNames.add("namespaceURI:/");
        illegalQNames.add("namespaceURI:;");
        illegalQNames.add("namespaceURI:`");
        illegalQNames.add("namespaceURI:<");
        illegalQNames.add("namespaceURI:>");
        illegalQNames.add("namespaceURI:,");
        illegalQNames.add("namespaceURI:a ");
        illegalQNames.add("namespaceURI:\"");

        doc = (Document) load("staffNS", builder);
        for (int indexN1009A = 0; indexN1009A < illegalQNames.size(); indexN1009A++) {
            qualifiedName = (String) illegalQNames.get(indexN1009A);
            domImpl = doc.getImplementation();

            boolean success = false;
            try {
                domImpl.createDocument(namespaceURI, qualifiedName, docType);
            } catch (DOMException ex) {
                success = (ex.code == DOMException.INVALID_CHARACTER_ERR);
            }
            assertTrue("throw_INVALID_CHARACTER_ERR", success);

        }
    }
    public void testCreateDocument6() throws Throwable {
        String namespaceURI = "http://ecommerce.org/schema";
        String qualifiedName = "xml:local";
        Document doc;
        DocumentType docType = null;

        DOMImplementation domImpl;

        doc = (Document) load("staffNS", builder);
        domImpl = doc.getImplementation();

        boolean success = false;
        try {
            domImpl.createDocument(namespaceURI, qualifiedName, docType);
        } catch (DOMException ex) {
            success = (ex.code == DOMException.NAMESPACE_ERR);
        }
        assertTrue("throw_NAMESPACE_ERR", success);

    }
    public void testCreateDocument7() throws Throwable {
        String namespaceURI = "http://www.ecommerce.org/schema";
        String qualifiedName = "y:x";
        Document doc;
        DocumentType docType = null;

        DOMImplementation domImpl;
        Document aNewDoc;
        String nodeName;
        String nodeValue;
        doc = (Document) load("staffNS", builder);
        domImpl = doc.getImplementation();
        aNewDoc = domImpl.createDocument(namespaceURI, qualifiedName, docType);
        nodeName = aNewDoc.getNodeName();
        nodeValue = aNewDoc.getNodeValue();
        assertEquals("nodeName", "#document", nodeName);
        assertNull("nodeValue", nodeValue);
    }
    public void testCreateDocument8() throws Throwable {
        String namespaceURI = "http://www.example.org/schema";
        DocumentType docType = null;

        DOMImplementation domImpl;

        domImpl = builder.getDOMImplementation();

        // BEGIN Android-changed
        //     Our exception priorities differ from the spec
        try {
            domImpl.createDocument(namespaceURI, "", docType);
            fail();
        } catch (DOMException ex) {
        }
        // END Android-changed
    }
}
