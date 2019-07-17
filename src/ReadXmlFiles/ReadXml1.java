package ReadXmlFiles;

import java.io.File;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;
import org.w3c.dom.NamedNodeMap;

public class ReadXml1
{	
	public static void main(String[] args) throws ParserConfigurationException, SAXException, IOException 
	{
		// 
/*		System.out.println("getcurrent proj="+System.getProperty("user.dir"));
		// getcurrent proj=   D:\Selenium Softwares\Projects\JavaPrograms
		
		//????// how to add or create  xml files into java proj?? learn
		//???????????????//
		
		File f=new File("D:\\qtp practise\\web apps\\env var1.xml");
		
		DocumentBuilder  dbuilder=DocumentBuilderFactory.newInstance().newDocumentBuilder(); //Care***********
		// throws ParserConfigurationException 
		Document doc=dbuilder.parse(f);
		//  import org.w3c.dom.Document; Care::::::::::**************
		//  throws SAXException
		String gnodename=doc.getDocumentElement().getNodeName();
		System.out.println("gnodename="+gnodename);// bookstore
		
		System.out.println("hasChildNodes="+doc.hasChildNodes()); // true
		if (doc.hasChildNodes())
		{
			NodeList nl=doc.getChildNodes();
			System.out.println("nl="+nl);//  nl=[#document: null]  ??????////
			
		}
		*/
		//*********************************
		
	    try 
	    {
	 
		//File file = new File("F:\\xmlfiles\\Student.xml");
	    //File file=new File("D:\\qtp practise\\web apps\\env var1.xml");
	    	File file=new File("D:\\qtp practise\\web apps\\Student.xml");
		DocumentBuilder dBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
	 
		Document doc = dBuilder.parse(file);
	 
		System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
		//Root element :bookstore
	 
		if (doc.hasChildNodes()) 
		{
	 
			printNote(doc.getChildNodes());
	 
		}
	 
	    } catch (Exception e) {
		System.out.println(e.getMessage());
	    }
	 
	  }
	 
	  private static void printNote(NodeList nodeList) 
	  {
	 
		  System.out.println("nl.getlenth="+nodeList.getLength());// nl.getlenth=1 ?????
	    for (int count = 0; count < nodeList.getLength(); count++) {
	 
		Node tempNode = nodeList.item(count);
		System.out.println("tempNode="+tempNode); // tempNode=[bookstore: null]
	 
		/*System.out.println("gnodeName="+tempNode.getNodeName()); //gnodeName=bookstore
		System.out.println("gnodeType="+tempNode.getNodeType());// gnodeType=1
		System.out.println("gnodeValue="+tempNode.getNodeValue()); // gnodeValue=null			
		*/
		
		// make sure it's element node.
		if (tempNode.getNodeType() == Node.ELEMENT_NODE) 
		{	 
			// get node name and value
			System.out.println("\nNode Name =" + tempNode.getNodeName() + " [OPEN]");
			System.out.println("Node Value =" + tempNode.getTextContent());
	 /*
				if (tempNode.hasAttributes()) 
				{
		 
					// get attributes names and values
					NamedNodeMap nodeMap = tempNode.getAttributes();
		 
						for (int i = 0; i < nodeMap.getLength(); i++)
						 {	 
							Node node = nodeMap.item(i);
							System.out.println("attr name : " + node.getNodeName());
							System.out.println("attr value : " + node.getNodeValue());
			 
						}
		 
				}
	 */
		/*	if (tempNode.hasChildNodes()) 
			{	 
				// loop again if has child nodes
				printNote(tempNode.getChildNodes());
	 
			}
	 */
			System.out.println("Node Name =" + tempNode.getNodeName() + " [CLOSE]");
	 
		}
	 
	    }
	 
	  }

} 
