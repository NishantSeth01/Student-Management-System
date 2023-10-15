
package student.details.com;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the student.details.com package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Delete_QNAME = new QName("http://com.details.student/", "delete");
    private final static QName _DeleteResponse_QNAME = new QName("http://com.details.student/", "deleteResponse");
    private final static QName _Display_QNAME = new QName("http://com.details.student/", "display");
    private final static QName _DisplayResponse_QNAME = new QName("http://com.details.student/", "displayResponse");
    private final static QName _GetRow_QNAME = new QName("http://com.details.student/", "getRow");
    private final static QName _GetRowResponse_QNAME = new QName("http://com.details.student/", "getRowResponse");
    private final static QName _Insert_QNAME = new QName("http://com.details.student/", "insert");
    private final static QName _InsertResponse_QNAME = new QName("http://com.details.student/", "insertResponse");
    private final static QName _Update_QNAME = new QName("http://com.details.student/", "update");
    private final static QName _UpdateResponse_QNAME = new QName("http://com.details.student/", "updateResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: student.details.com
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Delete }
     * 
     */
    public Delete createDelete() {
        return new Delete();
    }

    /**
     * Create an instance of {@link DeleteResponse }
     * 
     */
    public DeleteResponse createDeleteResponse() {
        return new DeleteResponse();
    }

    /**
     * Create an instance of {@link Display }
     * 
     */
    public Display createDisplay() {
        return new Display();
    }

    /**
     * Create an instance of {@link DisplayResponse }
     * 
     */
    public DisplayResponse createDisplayResponse() {
        return new DisplayResponse();
    }

    /**
     * Create an instance of {@link GetRow }
     * 
     */
    public GetRow createGetRow() {
        return new GetRow();
    }

    /**
     * Create an instance of {@link GetRowResponse }
     * 
     */
    public GetRowResponse createGetRowResponse() {
        return new GetRowResponse();
    }

    /**
     * Create an instance of {@link Insert }
     * 
     */
    public Insert createInsert() {
        return new Insert();
    }

    /**
     * Create an instance of {@link InsertResponse }
     * 
     */
    public InsertResponse createInsertResponse() {
        return new InsertResponse();
    }

    /**
     * Create an instance of {@link Update }
     * 
     */
    public Update createUpdate() {
        return new Update();
    }

    /**
     * Create an instance of {@link UpdateResponse }
     * 
     */
    public UpdateResponse createUpdateResponse() {
        return new UpdateResponse();
    }

    /**
     * Create an instance of {@link Student }
     * 
     */
    public Student createStudent() {
        return new Student();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Delete }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "delete")
    public JAXBElement<Delete> createDelete(Delete value) {
        return new JAXBElement<Delete>(_Delete_QNAME, Delete.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "deleteResponse")
    public JAXBElement<DeleteResponse> createDeleteResponse(DeleteResponse value) {
        return new JAXBElement<DeleteResponse>(_DeleteResponse_QNAME, DeleteResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Display }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "display")
    public JAXBElement<Display> createDisplay(Display value) {
        return new JAXBElement<Display>(_Display_QNAME, Display.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DisplayResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "displayResponse")
    public JAXBElement<DisplayResponse> createDisplayResponse(DisplayResponse value) {
        return new JAXBElement<DisplayResponse>(_DisplayResponse_QNAME, DisplayResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRow }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "getRow")
    public JAXBElement<GetRow> createGetRow(GetRow value) {
        return new JAXBElement<GetRow>(_GetRow_QNAME, GetRow.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetRowResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "getRowResponse")
    public JAXBElement<GetRowResponse> createGetRowResponse(GetRowResponse value) {
        return new JAXBElement<GetRowResponse>(_GetRowResponse_QNAME, GetRowResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Insert }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "insert")
    public JAXBElement<Insert> createInsert(Insert value) {
        return new JAXBElement<Insert>(_Insert_QNAME, Insert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link InsertResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "insertResponse")
    public JAXBElement<InsertResponse> createInsertResponse(InsertResponse value) {
        return new JAXBElement<InsertResponse>(_InsertResponse_QNAME, InsertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Update }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "update")
    public JAXBElement<Update> createUpdate(Update value) {
        return new JAXBElement<Update>(_Update_QNAME, Update.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://com.details.student/", name = "updateResponse")
    public JAXBElement<UpdateResponse> createUpdateResponse(UpdateResponse value) {
        return new JAXBElement<UpdateResponse>(_UpdateResponse_QNAME, UpdateResponse.class, null, value);
    }

}
