package autre;

public class Test {
	public static void main(String[] args){
        String doc1="doc1";
		String doc2="doc2";
		String doc3="doc3";
		String doc4="doc4";
		System.out.println("geee");
	
		ArbreFichiers n1= new ArbreFichiers(doc1);
		ArbreFichiers n2 = new ArbreFichiers(doc2);
		ArbreFichiers n3 = new ArbreFichiers(doc3);
		ArbreFichiers n4 = new ArbreFichiers(doc4);
		try {
		n1.ajouterFilsAuPere(n1, n3);
		n1.ajouterFilsAuPere(n1, n2);
		n1.ajouterFilsAuPere(n1, n4);
		n1.afficherArborescence(n2);
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		
		

	}
	

}
