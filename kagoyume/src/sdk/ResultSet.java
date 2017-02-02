//
// ���̃t�@�C���́AJavaTM Architecture for XML Binding(JAXB) Reference Implementation�Av2.2.8-b130911.1802�ɂ���Đ�������܂���
// <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>���Q�Ƃ��Ă�������
// �\�[�X�E�X�L�[�}�̍ăR���p�C�����ɂ��̃t�@�C���̕ύX�͎����܂��B
// ������: 2017.02.01 ���� 06:43:04 PM JST
//


package sdk;

import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>anonymous complex type��Java�N���X�B
 *
 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
 *
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Result">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Request">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Modules">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PriceRanges">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Range">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Subcategories">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Path">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Category">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Children">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Child">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Hit" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Image">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Small" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="ExImage">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Review">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Price">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="PriceLabel">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="FixedPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="taxIncluded" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Point">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Shipping">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="CategoryIdPath">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Category" maxOccurs="unbounded" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Brands">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Path">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="JAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                             &lt;element name="Store">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Payment">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Method" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="IsBestStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                       &lt;element name="Ratings">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Image">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="totalResultsAvailable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="firstResultPosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="totalResultsReturned" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "result"
})
@XmlRootElement(name = "ResultSet")
public class ResultSet {

    @XmlElement(name = "Result", required = true)
    protected ResultSet.Result result;
    @XmlAttribute(name = "totalResultsAvailable")
    protected String totalResultsAvailable;
    @XmlAttribute(name = "firstResultPosition")
    protected String firstResultPosition;
    @XmlAttribute(name = "totalResultsReturned")
    protected String totalResultsReturned;

    /**
     * result�v���p�e�B�̒l���擾���܂��B
     *
     * @return
     *     possible object is
     *     {@link ResultSet.Result }
     *
     */
    public ResultSet.Result getResult() {
        return result;
    }

    /**
     * result�v���p�e�B�̒l��ݒ肵�܂��B
     *
     * @param value
     *     allowed object is
     *     {@link ResultSet.Result }
     *
     */
    public void setResult(ResultSet.Result value) {
        this.result = value;
    }

    /**
     * totalResultsAvailable�v���p�e�B�̒l���擾���܂��B
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalResultsAvailable() {
        return totalResultsAvailable;
    }

    /**
     * totalResultsAvailable�v���p�e�B�̒l��ݒ肵�܂��B
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalResultsAvailable(String value) {
        this.totalResultsAvailable = value;
    }

    /**
     * firstResultPosition�v���p�e�B�̒l���擾���܂��B
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getFirstResultPosition() {
        return firstResultPosition;
    }

    /**
     * firstResultPosition�v���p�e�B�̒l��ݒ肵�܂��B
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setFirstResultPosition(String value) {
        this.firstResultPosition = value;
    }

    /**
     * totalResultsReturned�v���p�e�B�̒l���擾���܂��B
     *
     * @return
     *     possible object is
     *     {@link String }
     *
     */
    public String getTotalResultsReturned() {
        return totalResultsReturned;
    }

    /**
     * totalResultsReturned�v���p�e�B�̒l��ݒ肵�܂��B
     *
     * @param value
     *     allowed object is
     *     {@link String }
     *
     */
    public void setTotalResultsReturned(String value) {
        this.totalResultsReturned = value;
    }


    /**
     * <p>anonymous complex type��Java�N���X�B
     *
     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Request">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Modules">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PriceRanges">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Range">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Subcategories">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Path">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Category">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Children">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Child">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Hit" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Image">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Small" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="ExImage">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Review">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Price">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="PriceLabel">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="FixedPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="taxIncluded" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Point">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Shipping">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="CategoryIdPath">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Category" maxOccurs="unbounded" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Brands">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Path">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="JAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                   &lt;element name="Store">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Payment">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Method" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="IsBestStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                             &lt;element name="Ratings">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Image">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     *
     *
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "request",
        "modules",
        "hit"
    })
    public static class Result {

        @XmlElement(name = "Request", required = true)
        protected ResultSet.Result.Request request;
        @XmlElement(name = "Modules", required = true)
        protected ResultSet.Result.Modules modules;
        @XmlElement(name = "Hit")
        protected List<ResultSet.Result.Hit> hit;

        /**
         * request�v���p�e�B�̒l���擾���܂��B
         *
         * @return
         *     possible object is
         *     {@link ResultSet.Result.Request }
         *
         */
        public ResultSet.Result.Request getRequest() {
            return request;
        }

        /**
         * request�v���p�e�B�̒l��ݒ肵�܂��B
         *
         * @param value
         *     allowed object is
         *     {@link ResultSet.Result.Request }
         *
         */
        public void setRequest(ResultSet.Result.Request value) {
            this.request = value;
        }

        /**
         * modules�v���p�e�B�̒l���擾���܂��B
         *
         * @return
         *     possible object is
         *     {@link ResultSet.Result.Modules }
         *
         */
        public ResultSet.Result.Modules getModules() {
            return modules;
        }

        /**
         * modules�v���p�e�B�̒l��ݒ肵�܂��B
         *
         * @param value
         *     allowed object is
         *     {@link ResultSet.Result.Modules }
         *
         */
        public void setModules(ResultSet.Result.Modules value) {
            this.modules = value;
        }

        /**
         * Gets the value of the hit property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hit property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHit().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ResultSet.Result.Hit }
         *
         *
         */
        public List<ResultSet.Result.Hit> getHit() {
            if (hit == null) {
                hit = new ArrayList<ResultSet.Result.Hit>();
            }
            return this.hit;
        }


        /**
         * <p>anonymous complex type��Java�N���X�B
         *
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Headline" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Availability" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="PersonId" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Image">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Small" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="ExImage">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Review">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Price">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="PriceLabel">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="FixedPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="taxIncluded" type="{http://www.w3.org/2001/XMLSchema}string" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Point">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Shipping">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="CategoryIdPath">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Category" maxOccurs="unbounded" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Brands">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Path">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="JAN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="ISBN" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *         &lt;element name="Store">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Payment">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Method" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="IsBestStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                   &lt;element name="Ratings">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Image">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "name",
            "description",
            "headline",
            "url",
            "availability",
            "code",
            "personId",
            "image",
            "exImage",
            "review",
            "price",
            "priceLabel",
            "point",
            "shipping",
            "categoryIdPath",
            "brands",
            "jan",
            "isbn",
            "store"
        })
        public static class Hit {

            @XmlElement(name = "Name", required = true)
            protected String name;
            @XmlElement(name = "Description", required = true)
            protected String description;
            @XmlElement(name = "Headline", required = true)
            protected String headline;
            @XmlElement(name = "Url", required = true)
            protected String url;
            @XmlElement(name = "Availability", required = true)
            protected String availability;
            @XmlElement(name = "Code", required = true)
            protected String code;
            @XmlElement(name = "PersonId", required = true)
            protected String personId;
            @XmlElement(name = "Image", required = true)
            protected ResultSet.Result.Hit.Image image;
            @XmlElement(name = "ExImage", required = true)
            protected ResultSet.Result.Hit.ExImage exImage;
            @XmlElement(name = "Review", required = true)
            protected ResultSet.Result.Hit.Review review;
            @XmlElement(name = "Price", required = true)
            protected ResultSet.Result.Hit.Price price;
            @XmlElement(name = "PriceLabel", required = true)
            protected ResultSet.Result.Hit.PriceLabel priceLabel;
            @XmlElement(name = "Point", required = true)
            protected ResultSet.Result.Hit.Point point;
            @XmlElement(name = "Shipping", required = true)
            protected ResultSet.Result.Hit.Shipping shipping;
            @XmlElement(name = "CategoryIdPath", required = true)
            protected ResultSet.Result.Hit.CategoryIdPath categoryIdPath;
            @XmlElement(name = "Brands", required = true)
            protected ResultSet.Result.Hit.Brands brands;
            @XmlElement(name = "JAN", required = true)
            protected String jan;
            @XmlElement(name = "ISBN", required = true)
            protected String isbn;
            @XmlElement(name = "Store", required = true)
            protected ResultSet.Result.Hit.Store store;
            @XmlAttribute(name = "index")
            protected String index;

            /**
             * name�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getName() {
                return name;
            }

            /**
             * name�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setName(String value) {
                this.name = value;
            }

            /**
             * description�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getDescription() {
                return description;
            }

            /**
             * description�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * headline�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getHeadline() {
                return headline;
            }

            /**
             * headline�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setHeadline(String value) {
                this.headline = value;
            }

            /**
             * url�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getUrl() {
                return url;
            }

            /**
             * url�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setUrl(String value) {
                this.url = value;
            }

            /**
             * availability�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getAvailability() {
                return availability;
            }

            /**
             * availability�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setAvailability(String value) {
                this.availability = value;
            }

            /**
             * code�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getCode() {
                return code;
            }

            /**
             * code�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * personId�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getPersonId() {
                return personId;
            }

            /**
             * personId�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setPersonId(String value) {
                this.personId = value;
            }

            /**
             * image�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Image }
             *
             */
            public ResultSet.Result.Hit.Image getImage() {
                return image;
            }

            /**
             * image�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Image }
             *
             */
            public void setImage(ResultSet.Result.Hit.Image value) {
                this.image = value;
            }

            /**
             * exImage�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.ExImage }
             *
             */
            public ResultSet.Result.Hit.ExImage getExImage() {
                return exImage;
            }

            /**
             * exImage�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.ExImage }
             *
             */
            public void setExImage(ResultSet.Result.Hit.ExImage value) {
                this.exImage = value;
            }

            /**
             * review�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Review }
             *
             */
            public ResultSet.Result.Hit.Review getReview() {
                return review;
            }

            /**
             * review�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Review }
             *
             */
            public void setReview(ResultSet.Result.Hit.Review value) {
                this.review = value;
            }

            /**
             * price�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Price }
             *
             */
            public ResultSet.Result.Hit.Price getPrice() {
                return price;
            }

            /**
             * price�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Price }
             *
             */
            public void setPrice(ResultSet.Result.Hit.Price value) {
                this.price = value;
            }

            /**
             * priceLabel�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.PriceLabel }
             *
             */
            public ResultSet.Result.Hit.PriceLabel getPriceLabel() {
                return priceLabel;
            }

            /**
             * priceLabel�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.PriceLabel }
             *
             */
            public void setPriceLabel(ResultSet.Result.Hit.PriceLabel value) {
                this.priceLabel = value;
            }

            /**
             * point�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Point }
             *
             */
            public ResultSet.Result.Hit.Point getPoint() {
                return point;
            }

            /**
             * point�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Point }
             *
             */
            public void setPoint(ResultSet.Result.Hit.Point value) {
                this.point = value;
            }

            /**
             * shipping�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Shipping }
             *
             */
            public ResultSet.Result.Hit.Shipping getShipping() {
                return shipping;
            }

            /**
             * shipping�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Shipping }
             *
             */
            public void setShipping(ResultSet.Result.Hit.Shipping value) {
                this.shipping = value;
            }

            /**
             * categoryIdPath�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.CategoryIdPath }
             *
             */
            public ResultSet.Result.Hit.CategoryIdPath getCategoryIdPath() {
                return categoryIdPath;
            }

            /**
             * categoryIdPath�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.CategoryIdPath }
             *
             */
            public void setCategoryIdPath(ResultSet.Result.Hit.CategoryIdPath value) {
                this.categoryIdPath = value;
            }

            /**
             * brands�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Brands }
             *
             */
            public ResultSet.Result.Hit.Brands getBrands() {
                return brands;
            }

            /**
             * brands�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Brands }
             *
             */
            public void setBrands(ResultSet.Result.Hit.Brands value) {
                this.brands = value;
            }

            /**
             * jan�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getJAN() {
                return jan;
            }

            /**
             * jan�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setJAN(String value) {
                this.jan = value;
            }

            /**
             * isbn�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getISBN() {
                return isbn;
            }

            /**
             * isbn�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setISBN(String value) {
                this.isbn = value;
            }

            /**
             * store�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Hit.Store }
             *
             */
            public ResultSet.Result.Hit.Store getStore() {
                return store;
            }

            /**
             * store�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Hit.Store }
             *
             */
            public void setStore(ResultSet.Result.Hit.Store value) {
                this.store = value;
            }

            /**
             * index�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getIndex() {
                return index;
            }

            /**
             * index�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setIndex(String value) {
                this.index = value;
            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Path">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "name",
                "path"
            })
            public static class Brands {

                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "Path", required = true)
                protected ResultSet.Result.Hit.Brands.Path path;

                /**
                 * name�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * name�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * path�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Hit.Brands.Path }
                 *
                 */
                public ResultSet.Result.Hit.Brands.Path getPath() {
                    return path;
                }

                /**
                 * path�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Hit.Brands.Path }
                 *
                 */
                public void setPath(ResultSet.Result.Hit.Brands.Path value) {
                    this.path = value;
                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "brand"
                })
                public static class Path {

                    @XmlElement(name = "Brand")
                    protected List<ResultSet.Result.Hit.Brands.Path.Brand> brand;

                    /**
                     * Gets the value of the brand property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the brand property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getBrand().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ResultSet.Result.Hit.Brands.Path.Brand }
                     *
                     *
                     */
                    public List<ResultSet.Result.Hit.Brands.Path.Brand> getBrand() {
                        if (brand == null) {
                            brand = new ArrayList<ResultSet.Result.Hit.Brands.Path.Brand>();
                        }
                        return this.brand;
                    }


                    /**
                     * <p>anonymous complex type��Java�N���X�B
                     *
                     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "id"
                    })
                    public static class Brand {

                        @XmlElement(name = "Id", required = true)
                        protected String id;

                        /**
                         * id�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getId() {
                            return id;
                        }

                        /**
                         * id�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setId(String value) {
                            this.id = value;
                        }

                    }

                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Category" maxOccurs="unbounded" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "category"
            })
            public static class CategoryIdPath {

                @XmlElement(name = "Category")
                protected List<ResultSet.Result.Hit.CategoryIdPath.Category> category;

                /**
                 * Gets the value of the category property.
                 *
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the category property.
                 *
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCategory().add(newItem);
                 * </pre>
                 *
                 *
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link ResultSet.Result.Hit.CategoryIdPath.Category }
                 *
                 *
                 */
                public List<ResultSet.Result.Hit.CategoryIdPath.Category> getCategory() {
                    if (category == null) {
                        category = new ArrayList<ResultSet.Result.Hit.CategoryIdPath.Category>();
                    }
                    return this.category;
                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id"
                })
                public static class Category {

                    @XmlElement(name = "Id", required = true)
                    protected String id;

                    /**
                     * id�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getId() {
                        return id;
                    }

                    /**
                     * id�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setId(String value) {
                        this.id = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "url"
            })
            public static class ExImage {

                @XmlElement(name = "Url", required = true)
                protected String url;

                /**
                 * url�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * url�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUrl(String value) {
                    this.url = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Small" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "small",
                "medium"
            })
            public static class Image {

                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "Small", required = true)
                protected String small;
                @XmlElement(name = "Medium", required = true)
                protected String medium;

                /**
                 * id�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getId() {
                    return id;
                }

                /**
                 * id�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * small�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSmall() {
                    return small;
                }

                /**
                 * small�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSmall(String value) {
                    this.small = value;
                }

                /**
                 * medium�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getMedium() {
                    return medium;
                }

                /**
                 * medium�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setMedium(String value) {
                    this.medium = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Amount" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Times" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "amount",
                "times"
            })
            public static class Point {

                @XmlElement(name = "Amount", required = true)
                protected String amount;
                @XmlElement(name = "Times", required = true)
                protected String times;

                /**
                 * amount�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getAmount() {
                    return amount;
                }

                /**
                 * amount�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setAmount(String value) {
                    this.amount = value;
                }

                /**
                 * times�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTimes() {
                    return times;
                }

                /**
                 * times�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTimes(String value) {
                    this.times = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="currency" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/extension>
             *   &lt;/simpleContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "value"
            })
            public static class Price {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "currency")
                protected String currency;

                /**
                 * value�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * value�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * currency�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCurrency() {
                    return currency;
                }

                /**
                 * currency�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCurrency(String value) {
                    this.currency = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="FixedPrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="SalePrice" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *       &lt;attribute name="taxIncluded" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "fixedPrice",
                "salePrice"
            })
            public static class PriceLabel {

                @XmlElement(name = "FixedPrice", required = true)
                protected String fixedPrice;
                @XmlElement(name = "SalePrice", required = true)
                protected String salePrice;
                @XmlAttribute(name = "taxIncluded")
                protected String taxIncluded;

                /**
                 * fixedPrice�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getFixedPrice() {
                    return fixedPrice;
                }

                /**
                 * fixedPrice�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setFixedPrice(String value) {
                    this.fixedPrice = value;
                }

                /**
                 * salePrice�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getSalePrice() {
                    return salePrice;
                }

                /**
                 * salePrice�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setSalePrice(String value) {
                    this.salePrice = value;
                }

                /**
                 * taxIncluded�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getTaxIncluded() {
                    return taxIncluded;
                }

                /**
                 * taxIncluded�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setTaxIncluded(String value) {
                    this.taxIncluded = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "rate",
                "count",
                "url"
            })
            public static class Review {

                @XmlElement(name = "Rate", required = true)
                protected String rate;
                @XmlElement(name = "Count", required = true)
                protected String count;
                @XmlElement(name = "Url", required = true)
                protected String url;

                /**
                 * rate�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getRate() {
                    return rate;
                }

                /**
                 * rate�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setRate(String value) {
                    this.rate = value;
                }

                /**
                 * count�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCount() {
                    return count;
                }

                /**
                 * count�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCount(String value) {
                    this.count = value;
                }

                /**
                 * url�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * url�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUrl(String value) {
                    this.url = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "code",
                "name"
            })
            public static class Shipping {

                @XmlElement(name = "Code", required = true)
                protected String code;
                @XmlElement(name = "Name", required = true)
                protected String name;

                /**
                 * code�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * code�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * name�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * name�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Url" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Payment">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Method" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="IsBestStore" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *         &lt;element name="Ratings">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Image">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "id",
                "name",
                "url",
                "payment",
                "isBestStore",
                "ratings",
                "image"
            })
            public static class Store {

                @XmlElement(name = "Id", required = true)
                protected String id;
                @XmlElement(name = "Name", required = true)
                protected String name;
                @XmlElement(name = "Url", required = true)
                protected String url;
                @XmlElement(name = "Payment", required = true)
                protected ResultSet.Result.Hit.Store.Payment payment;
                @XmlElement(name = "IsBestStore", required = true)
                protected String isBestStore;
                @XmlElement(name = "Ratings", required = true)
                protected ResultSet.Result.Hit.Store.Ratings ratings;
                @XmlElement(name = "Image", required = true)
                protected ResultSet.Result.Hit.Store.Image image;

                /**
                 * id�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getId() {
                    return id;
                }

                /**
                 * id�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setId(String value) {
                    this.id = value;
                }

                /**
                 * name�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getName() {
                    return name;
                }

                /**
                 * name�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setName(String value) {
                    this.name = value;
                }

                /**
                 * url�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getUrl() {
                    return url;
                }

                /**
                 * url�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setUrl(String value) {
                    this.url = value;
                }

                /**
                 * payment�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Hit.Store.Payment }
                 *
                 */
                public ResultSet.Result.Hit.Store.Payment getPayment() {
                    return payment;
                }

                /**
                 * payment�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Hit.Store.Payment }
                 *
                 */
                public void setPayment(ResultSet.Result.Hit.Store.Payment value) {
                    this.payment = value;
                }

                /**
                 * isBestStore�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link String }
                 *
                 */
                public String getIsBestStore() {
                    return isBestStore;
                }

                /**
                 * isBestStore�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *
                 */
                public void setIsBestStore(String value) {
                    this.isBestStore = value;
                }

                /**
                 * ratings�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Hit.Store.Ratings }
                 *
                 */
                public ResultSet.Result.Hit.Store.Ratings getRatings() {
                    return ratings;
                }

                /**
                 * ratings�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Hit.Store.Ratings }
                 *
                 */
                public void setRatings(ResultSet.Result.Hit.Store.Ratings value) {
                    this.ratings = value;
                }

                /**
                 * image�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Hit.Store.Image }
                 *
                 */
                public ResultSet.Result.Hit.Store.Image getImage() {
                    return image;
                }

                /**
                 * image�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Hit.Store.Image }
                 *
                 */
                public void setImage(ResultSet.Result.Hit.Store.Image value) {
                    this.image = value;
                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Medium" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "id",
                    "medium"
                })
                public static class Image {

                    @XmlElement(name = "Id", required = true)
                    protected String id;
                    @XmlElement(name = "Medium", required = true)
                    protected String medium;

                    /**
                     * id�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getId() {
                        return id;
                    }

                    /**
                     * id�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setId(String value) {
                        this.id = value;
                    }

                    /**
                     * medium�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getMedium() {
                        return medium;
                    }

                    /**
                     * medium�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setMedium(String value) {
                        this.medium = value;
                    }

                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Method" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "method"
                })
                public static class Payment {

                    @XmlElement(name = "Method")
                    protected List<ResultSet.Result.Hit.Store.Payment.Method> method;

                    /**
                     * Gets the value of the method property.
                     *
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the method property.
                     *
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getMethod().add(newItem);
                     * </pre>
                     *
                     *
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ResultSet.Result.Hit.Store.Payment.Method }
                     *
                     *
                     */
                    public List<ResultSet.Result.Hit.Store.Payment.Method> getMethod() {
                        if (method == null) {
                            method = new ArrayList<ResultSet.Result.Hit.Store.Payment.Method>();
                        }
                        return this.method;
                    }


                    /**
                     * <p>anonymous complex type��Java�N���X�B
                     *
                     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Code" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "code",
                        "name"
                    })
                    public static class Method {

                        @XmlElement(name = "Code", required = true)
                        protected String code;
                        @XmlElement(name = "Name", required = true)
                        protected String name;

                        /**
                         * code�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getCode() {
                            return code;
                        }

                        /**
                         * code�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setCode(String value) {
                            this.code = value;
                        }

                        /**
                         * name�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * name�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                    }

                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Rate" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Count" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "rate",
                    "count"
                })
                public static class Ratings {

                    @XmlElement(name = "Rate", required = true)
                    protected String rate;
                    @XmlElement(name = "Count", required = true)
                    protected String count;

                    /**
                     * rate�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getRate() {
                        return rate;
                    }

                    /**
                     * rate�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setRate(String value) {
                        this.rate = value;
                    }

                    /**
                     * count�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getCount() {
                        return count;
                    }

                    /**
                     * count�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setCount(String value) {
                        this.count = value;
                    }

                }

            }

        }


        /**
         * <p>anonymous complex type��Java�N���X�B
         *
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="PriceRanges">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Range">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Subcategories">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Path">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Category">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Children">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Child">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "priceRanges",
            "subcategories"
        })
        public static class Modules {

            @XmlElement(name = "PriceRanges", required = true)
            protected ResultSet.Result.Modules.PriceRanges priceRanges;
            @XmlElement(name = "Subcategories", required = true)
            protected ResultSet.Result.Modules.Subcategories subcategories;

            /**
             * priceRanges�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Modules.PriceRanges }
             *
             */
            public ResultSet.Result.Modules.PriceRanges getPriceRanges() {
                return priceRanges;
            }

            /**
             * priceRanges�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Modules.PriceRanges }
             *
             */
            public void setPriceRanges(ResultSet.Result.Modules.PriceRanges value) {
                this.priceRanges = value;
            }

            /**
             * subcategories�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link ResultSet.Result.Modules.Subcategories }
             *
             */
            public ResultSet.Result.Modules.Subcategories getSubcategories() {
                return subcategories;
            }

            /**
             * subcategories�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link ResultSet.Result.Modules.Subcategories }
             *
             */
            public void setSubcategories(ResultSet.Result.Modules.Subcategories value) {
                this.subcategories = value;
            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Range">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "range"
            })
            public static class PriceRanges {

                @XmlElement(name = "Range", required = true)
                protected ResultSet.Result.Modules.PriceRanges.Range range;

                /**
                 * range�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Modules.PriceRanges.Range }
                 *
                 */
                public ResultSet.Result.Modules.PriceRanges.Range getRange() {
                    return range;
                }

                /**
                 * range�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Modules.PriceRanges.Range }
                 *
                 */
                public void setRange(ResultSet.Result.Modules.PriceRanges.Range value) {
                    this.range = value;
                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Low" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="High" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "low",
                    "high",
                    "hits"
                })
                public static class Range {

                    @XmlElement(name = "Low", required = true)
                    protected String low;
                    @XmlElement(name = "High", required = true)
                    protected String high;
                    @XmlElement(name = "Hits", required = true)
                    protected String hits;

                    /**
                     * low�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getLow() {
                        return low;
                    }

                    /**
                     * low�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setLow(String value) {
                        this.low = value;
                    }

                    /**
                     * high�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getHigh() {
                        return high;
                    }

                    /**
                     * high�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setHigh(String value) {
                        this.high = value;
                    }

                    /**
                     * hits�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link String }
                     *
                     */
                    public String getHits() {
                        return hits;
                    }

                    /**
                     * hits�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *
                     */
                    public void setHits(String value) {
                        this.hits = value;
                    }

                }

            }


            /**
             * <p>anonymous complex type��Java�N���X�B
             *
             * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
             *
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Path">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Category">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Children">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Child">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             *
             *
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "path",
                "children"
            })
            public static class Subcategories {

                @XmlElement(name = "Path", required = true)
                protected ResultSet.Result.Modules.Subcategories.Path path;
                @XmlElement(name = "Children", required = true)
                protected ResultSet.Result.Modules.Subcategories.Children children;

                /**
                 * path�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Modules.Subcategories.Path }
                 *
                 */
                public ResultSet.Result.Modules.Subcategories.Path getPath() {
                    return path;
                }

                /**
                 * path�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Modules.Subcategories.Path }
                 *
                 */
                public void setPath(ResultSet.Result.Modules.Subcategories.Path value) {
                    this.path = value;
                }

                /**
                 * children�v���p�e�B�̒l���擾���܂��B
                 *
                 * @return
                 *     possible object is
                 *     {@link ResultSet.Result.Modules.Subcategories.Children }
                 *
                 */
                public ResultSet.Result.Modules.Subcategories.Children getChildren() {
                    return children;
                }

                /**
                 * children�v���p�e�B�̒l��ݒ肵�܂��B
                 *
                 * @param value
                 *     allowed object is
                 *     {@link ResultSet.Result.Modules.Subcategories.Children }
                 *
                 */
                public void setChildren(ResultSet.Result.Modules.Subcategories.Children value) {
                    this.children = value;
                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Child">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "child"
                })
                public static class Children {

                    @XmlElement(name = "Child", required = true)
                    protected ResultSet.Result.Modules.Subcategories.Children.Child child;

                    /**
                     * child�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link ResultSet.Result.Modules.Subcategories.Children.Child }
                     *
                     */
                    public ResultSet.Result.Modules.Subcategories.Children.Child getChild() {
                        return child;
                    }

                    /**
                     * child�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link ResultSet.Result.Modules.Subcategories.Children.Child }
                     *
                     */
                    public void setChild(ResultSet.Result.Modules.Subcategories.Children.Child value) {
                        this.child = value;
                    }


                    /**
                     * <p>anonymous complex type��Java�N���X�B
                     *
                     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Hits" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "id",
                        "name",
                        "hits"
                    })
                    public static class Child {

                        @XmlElement(name = "Id", required = true)
                        protected String id;
                        @XmlElement(name = "Name", required = true)
                        protected String name;
                        @XmlElement(name = "Hits", required = true)
                        protected String hits;

                        /**
                         * id�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getId() {
                            return id;
                        }

                        /**
                         * id�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setId(String value) {
                            this.id = value;
                        }

                        /**
                         * name�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * name�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                        /**
                         * hits�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getHits() {
                            return hits;
                        }

                        /**
                         * hits�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setHits(String value) {
                            this.hits = value;
                        }

                    }

                }


                /**
                 * <p>anonymous complex type��Java�N���X�B
                 *
                 * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                 *
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="Category">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 *
                 *
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "category"
                })
                public static class Path {

                    @XmlElement(name = "Category", required = true)
                    protected ResultSet.Result.Modules.Subcategories.Path.Category category;

                    /**
                     * category�v���p�e�B�̒l���擾���܂��B
                     *
                     * @return
                     *     possible object is
                     *     {@link ResultSet.Result.Modules.Subcategories.Path.Category }
                     *
                     */
                    public ResultSet.Result.Modules.Subcategories.Path.Category getCategory() {
                        return category;
                    }

                    /**
                     * category�v���p�e�B�̒l��ݒ肵�܂��B
                     *
                     * @param value
                     *     allowed object is
                     *     {@link ResultSet.Result.Modules.Subcategories.Path.Category }
                     *
                     */
                    public void setCategory(ResultSet.Result.Modules.Subcategories.Path.Category value) {
                        this.category = value;
                    }


                    /**
                     * <p>anonymous complex type��Java�N���X�B
                     *
                     * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
                     *
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;sequence>
                     *         &lt;element name="Id" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Name" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *       &lt;/sequence>
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     *
                     *
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "id",
                        "name"
                    })
                    public static class Category {

                        @XmlElement(name = "Id", required = true)
                        protected String id;
                        @XmlElement(name = "Name", required = true)
                        protected String name;

                        /**
                         * id�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getId() {
                            return id;
                        }

                        /**
                         * id�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setId(String value) {
                            this.id = value;
                        }

                        /**
                         * name�v���p�e�B�̒l���擾���܂��B
                         *
                         * @return
                         *     possible object is
                         *     {@link String }
                         *
                         */
                        public String getName() {
                            return name;
                        }

                        /**
                         * name�v���p�e�B�̒l��ݒ肵�܂��B
                         *
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *
                         */
                        public void setName(String value) {
                            this.name = value;
                        }

                    }

                }

            }

        }


        /**
         * <p>anonymous complex type��Java�N���X�B
         *
         * <p>���̃X�L�[�}�E�t���O�����g�́A���̃N���X���Ɋ܂܂��\�������R���e���c���w�肵�܂��B
         *
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Query" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         *
         *
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "query"
        })
        public static class Request {

            @XmlElement(name = "Query", required = true)
            protected String query;

            /**
             * query�v���p�e�B�̒l���擾���܂��B
             *
             * @return
             *     possible object is
             *     {@link String }
             *
             */
            public String getQuery() {
                return query;
            }

            /**
             * query�v���p�e�B�̒l��ݒ肵�܂��B
             *
             * @param value
             *     allowed object is
             *     {@link String }
             *
             */
            public void setQuery(String value) {
                this.query = value;
            }

        }

    }

}
