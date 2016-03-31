import java.net.*;
import java.util.*;
import java.io.*;
import javax.xml.*;
import org.w3c.dom.*;
import java.lang.*;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;



public class UserControler {
    private static HashMap<String, String> article ;
    private static ArrayList<Map<String, String>> arrayList ;
    private LinkedList<Integer> ArticleIDs  = new LinkedList<>();// {"00001", "00002"};
   
    private LinkedList<String> ArticleTitle  = new LinkedList<>();
   
    private LinkedList<String> ArticleAuthors  = new LinkedList<>();
  
    private LinkedList<String> ArticleDate  = new LinkedList<>();
  
    private LinkedList<String> ArticleBody  = new LinkedList<>();
   
    private LinkedList<String> ArticleImages  = new LinkedList<>();
   
    
    public UserControler(){
        ArticleIDs.add(1);
       ArticleIDs.add(2);
         ArticleIDs.add(3);
		ArticleIDs.add(4);
		  
        ArticleTitle.add("Selfie + money + Snapchat = robbed! Don't flash your cash...");
        ArticleTitle.add("Police destroy evidence with 10 failed passcode attempts on iPhone");
		ArticleTitle.add("'You gotta touch the banana' for Wi-Fi access, says sys admin");
		ArticleTitle.add("Facebook 'Message Requests' lets you contact anyone, even if you're not friends");
        
		
        ArticleAuthors.add("Paul Ducklin");
        ArticleAuthors.add("Lisa Vaas");
		ArticleAuthors.add("Lisa Vaas");
		ArticleAuthors.add("Lee Munson");
        
      
        
        ArticleDate.add("September 24, 2014");
        ArticleDate.add("September 18, 2014");
		 ArticleDate.add("August 24, 2014");
		 ArticleDate.add("August 24, 2014");
        
        ArticleBody.add("Not that you might fall off a cliff, or get eaten by a shark, or run over by a train while "
		+ " posing for that 1,000,000-clicks selfie shot, although those are all risks to be aware of. The problem is the "
		+ " casually-taken selfie that gets just one view by the wrong person. One lousy, single, solitary view by someone "
		+ " who figures that he wants what you've got in the picture.Like a wedge of cash to which you proudly drew the world's "
		+ " attention.That's apparently what happened to a youngster in Florida, who posted a happy snap of himself with $280" 
		+ " in readies only to find himself at the pointy end of an intruder's knife.");
      

	  ArticleBody.add("In January 2014, a Massachusetts cop was swearing into his mobile phone while working a traffic "
		+ " detail at a construction site.The F bombs appeared to upset an elderly lady walking by, so a man on a nearby "
		+ " front porch asked the officer, Thomas Barboza, to stop swearing.");
		
		ArticleBody.add("Here's how it worked: The banana was wired to a Makey Makey circuit board and a cheap Raspberry Pi computer that dispensed an 8-hour personal password for guests to access the company’s captive Wi-Fi portal when a finger touch to the fruit authentication system provided the necessary micro-charge."
+"What’s more, Danish network engineer Stefan Milo swore at one point that the banana was there to stay – it would never get swapped out, even after reaching the age of rich, compost-worthy brown:</p>"
+"<blockquote>If you want Wi-Fi, you gotta touch it. No matter how smelly it is, YOU TOUCH IT!!</blockquote>"
+"You gotta touch the banana. If you can’t touch the banana, you gotta see the GIF."
+"As Milo explained in his initial Reddit post last Monday, he was tasked with setting up the captive portal and creating the temporary password vouchers – in a spreadsheet."
+"Well, he said, no thanks: he doesn’t do spreadsheets."
+"He expounded in a chat with The Register:"
+"<blockquote>When you go to $corp, and the receptionist hands you a small piece of paper that someone printed out on an A4, and then spent time on cutting out into small pieces, I cringe."
+"Even if you have a small voucher printer, it still involves the receptionist, installing of the printer, support when the printer driver effs up, etc. And it still involves paper – what is this? 1999?</blockquote>"
+"<p>So instead of time-warping back to the paper days, he spent a weekend setting up a script on a Raspberry Pi that generated a unique guest key on command and displayed the code on an attached display."
+"It all took 8-10 hours, took up 20 lines of code, and cost him less than $100, including fabrication of an acrylic case."
+"The script was triggered via the Makey Makey board, which alerted the Pi whenever it detected a voltage drop in the attached banana."
+"The touch of a human finger created a tiny electrical connection, which then changed the banana’s capacitance – a change that could be detected by the circuit board."
+"The Pi didn’t know it was taking orders from a piece of fruit. As far as it’s concerned, a banana is as good as a keyboard, or a mouse."
+"The system can be powered by things non-banana, as well, as you can see in Makey Makey’s video, which shows the circuit board being switched by all sorts of household and culinary items: scissors, a slip-n-slide, a cream pie, or Jello, for example."
+"As Milo’s image shows, the pin cable for the circuit board rests on the banana, and its USB stick connects it to the Pi."
+"He posted this list of reasons as answer to the inevitable question – “Why?”</p><p>1.It’s fun</p><p>2.It’ll make people smile</p>"
+"<p>3.It beats a static WPA password in funnyness</p>"
+"<p>4.When people leave our office, then can’t access our Wi-Fi because there’s no banana to touch</p>"
+"<p>When users touched the banana, they got a personal password good for 8 hours, all without pestering a receptionist, and all without reading a number off a kludgy spreadsheet."
+"Milo says the Pi has 5,000 vouchers.He told The Register that the banana setup only served about five guests a week, but with a simple expansion of the voucher file (and regular banana changes), the setup could run for years on end, accommodating thousands of office guests."
+"And why am I using past tense to talk about this authentication system, you may well ask?"
+"Because the day after he swore that the banana would live in rotten eternity, tethered to the Pi, with Milo ruling over the system as Lord of the Fruit Flies, the banana was no more, he said in a banana update:</p>"
+"<blockquote>It’s a croissant now. Bossman ate the banana.</blockquote>");
    
ArticleBody.add("<p> Speaking with random strangers just became a whole lot easier with a new service called “Message Requests."
+"No more will your idle Messenger musings be sent to the endless purgatory known as the “Other Inbox” – a place so obscure it didn’t even appear in iOS or Android renditions of the popular social network – when sent to non-friends or non-friends-of-friends."
+"Instead, says Messenger chief David Marcus, such important missives will now be given the level of prominence they deserve, appearing as a message request along with an appropriate notification."
+"Taking to his own Facebook account, Marcus wrote “Now, the only thing you need to talk to virtually anyone in the world, is their name,” before defining the one and only rule for the new Message Requests feature:"
+"<blockquote>The rule is pretty simple: If you're friends on Facebook, if you have each other's contact info in your phone and have these synced, or if you have an existing open thread, the new messages from that sender will be routed to your inbox. "
+"Everything else will now be a message request, minus spam attempts that we will continue to ruthlessly combat.</blockquote>"
+"To help combat the threat of having a weirdo hassle you after a drunken chat in the pub, Facebook has designed Message Requests in a way that gives you just enough information to know who has contacted you – you’ll see their name, profile picture, some other publicly available information and a list of any mutual friends – as well as an ability to completely blow them off without them knowing whether you read their message or not."
+"When you receive such a message you will have the option of responding to it – which will cause the message thread to be transferred to your normal inbox – or completely ignore it, in which case it will be hidden away in the Filtered Requests folder, along with anything Facebook has identified as being spam."
+"And if you do delete or ignore one of these unsolicited messages, the sender will never be able to contact you again – an improvement of sorts over the current situation which may see you forced to exchange phone numbers or friend requests for what should be a one-off personal or business conversation."
+"Talking to TechCrunch, Tony Leach, Messenger’s Product Manager, spun the release of Message Requests as an opportunity for Facebook users to connect with long-lost family members and kindly strangers:"
+"<blockquote>We've heard so many stories like estranged parents trying to get back in touch, or you lost your wallet and someone trying to get in touch with you. "
+"That's why we want to replace that with a system that makes it a lot easier to catch the messages that you want to see. "
+"A level of openness where you can get in touch with anyone in the world but still have the control yourself of who contacts you and who can't.</blockquote>"
+"<p>Of course Facebook itself will undoubtedly reap the benefits of an enhanced Messenger too – by allowing its users to make contact with any one of the 1.5 billion people already using the social network, uptake of Messenger is only likely to grow from its current base of 700 million active users."
+"Describing the change to Messenger, which is due to roll out over the next few days, as “small,” Marcus suggested the “foundational development” was just the beginning as the Facebook team continues “to improve ways to find the people you want to communicate with."
+"Brits interested in taking advantage of the new feature may have to act quickly though – Facebook Messenger, along with the likes of Snapchat and WhatsApp, could still be under threat from Home Secretary Theresa May and the yet-to-be ratified Investigatory Powers Bill, which seeks to outlaw the use of encryption with some apps, as well as force service providers to hand communications data to authorities when asked for."
+"</p>");


    
        
        ArticleImages.add("snap.png");
        ArticleImages.add("iphone.png");
        ArticleImages.add("banana.png");
		 ArticleImages.add("facebook.png");
       
    }
    public ArrayList<Map<String, String>> getAllArticle(){
        
        arrayList = new ArrayList<>();
        int length = getNumberOfArticles();
      //  length = length + 5;
        for (int i = 0; i < length; i++) {
             
            article = new HashMap<String, String>();
            /*
            if(i <= 2){
                article.put("ArticleIDs",ArticleIDs.get(0));
                article.put("ArticleTitle",ArticleTitle.get(0));
                article.put("ArticleDate",ArticleDate.get(0));
                article.put("ArticleImages",ArticleImages.get(0));
                article.put("ArticleBody",ArticleBody.get(0)); 
				       article.put("ArticleAuthors",ArticleAuthors.get(0)); 
            }else{
				
                  article.put("ArticleIDs",ArticleIDs.get(1));
                article.put("ArticleTitle",ArticleTitle.get(1));
                article.put("ArticleDate",ArticleDate.get(1));
                article.put("ArticleImages",ArticleImages.get(1));
                article.put("ArticleBody",ArticleBody.get(1)); 
				 article.put("ArticleAuthors",ArticleAuthors.get(1)); 
            } */
		
		
            
         
                article.put("ArticleIDs",ArticleIDs.get(i).toString());
                article.put("ArticleTitle",ArticleTitle.get(i));
                article.put("ArticleDate",ArticleDate.get(i));
                article.put("ArticleImages",ArticleImages.get(i));
                article.put("ArticleBody",ArticleBody.get(i)); 
				       article.put("ArticleAuthors",ArticleAuthors.get(i)); 
         
            arrayList.add(article);
        
        
        
        
}
	return arrayList;
	}
    
    public ArrayList<Map<String, String>> getOneArticle(Integer id){
        arrayList = new ArrayList<>();
        if(!id.equals("")){

            int length = getNumberOfArticles();
            for (int i = 0; i<length; i++){
                if(id == ArticleIDs.get(i)){
					
                    article = new HashMap<String, String>();
					
                    article.put("ArticleIDs",ArticleIDs.get(i).toString());
                    article.put("ArticleTitle",ArticleTitle.get(i));
                    article.put("ArticleAuthors",ArticleAuthors.get(i));
                    article.put("ArticleBody",ArticleBody.get(i));
                    article.put("ArticleDate",ArticleDate.get(i));
                    article.put("ArticleImages",ArticleImages.get(i));
                    
                    arrayList.add(article);
            
    }

            }
        
        }
        return arrayList;
    
	}
	
	
	public String getAllArticleXML(){
		Document doc=null;
		String output= null;
		try {
			
			 doc = loadTestDocument("https://hidden-savannah-88916.herokuapp.com/articles.xml");
			 TransformerFactory tf = TransformerFactory.newInstance();
Transformer transformer = tf.newTransformer();
transformer.setOutputProperty(OutputKeys.OMIT_XML_DECLARATION, "yes");
StringWriter writer = new StringWriter();
transformer.transform(new DOMSource(doc), new StreamResult(writer));
 output = writer.getBuffer().toString().replaceAll("\n|\r", "");
       //String txt = System.out.println(doc);
       
      
		}
		catch (Exception e) {
			
		}

return  output;

}

public static Document loadTestDocument(String url) throws Exception {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        factory.setNamespaceAware(true);
        return factory.newDocumentBuilder().parse(new URL(url).openStream());
    }
	

	
	
public static String getoneArticleXML(String id){
		String output = null;
	try {




File ARTICLES = new File("articles.xml");

DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();

DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();


Document doc = loadTestDocument("https://hidden-savannah-88916.herokuapp.com/articles.xml");//dBuilder.parse(ARTICLES);


doc.getDocumentElement().normalize();

//System.out.println("root of xml file" + doc.getDocumentElement().getNodeName());

NodeList nodes = doc.getElementsByTagName("article");

//System.out.println("==========================");




for (int i = 0; i < nodes.getLength(); i++) {

Node node = nodes.item(i);

//output="inside the loop";


//if (node.getNodeType() != Node.ELEMENT_NODE) {
	
//output="inside the 1st IF";	
//}

//else{

Element element = (Element) node;

//output="inside the 1st IF";
 if (id.equals(getValue("id", element))) {// (id == getValue("ID", element)){
	

	output = "<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + "<articles> <article>" + "<id>" + getValue("id", element)+ "</id>" + "<title>" + getValue("title", element)+ "</title>" + "<author>" + getValue("author", element)+ "</author>" + 
								 "<date>" + getValue("date", element) + "</date>" +
								 "<body>" + getValue("body", element) + "</body>" +
								 "<image>" + getValue("image", element) + "</image>" +
								 "<url>" + getValue("url", element) + "</url>" +
                           "</article> </articles>";

	
}



//}



	}} catch (Exception ex) {

	ex.printStackTrace();}
	
	
	return output;
	}
	
	
	public String createArticle( String articleTitle, String articleAuthors,
            String articleDate, String articleBody){
				Integer id = getNumberOfArticles() +1;
     
        ArticleIDs.add(id);
        ArticleTitle.add(articleTitle);
        ArticleAuthors.add(articleAuthors);
        ArticleDate.add(articleDate);
        ArticleBody.add(articleBody);
		ArticleImages.add("none");
          
        return ArticleTitle.get(id-1);
	   
	
	   }
        
        
      



public static String getValue(String tag, Element element) {
NodeList nodes = element.getElementsByTagName(tag).item(0).getChildNodes();
Node node = (Node) nodes.item(0);
return node.getNodeValue();

}
public Integer getNumberOfArticles(){
        int size = ArticleIDs.size();
        return size;
    }
    public String getArticleTitle(){
        return ArticleTitle.get(0);
    }

}

	





	
	