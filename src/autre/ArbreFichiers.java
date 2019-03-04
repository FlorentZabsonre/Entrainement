package autre;

public class ArbreFichiers {
	private ArbreFichiers pere;
	private ArbreFichiers premierFils;
	private ArbreFichiers filsGauche;
	private ArbreFichiers filsDroit;
	private String nomDuFichierOuDossier;
	private String contenuDuFichierOuDossier;
	private boolean estFichier;
	private int tailleFichierOuDossier;
	
	
	//LES CONSTRUCTEURS 
	//ArbreFichiers(){this.pere.nomDuFichierOuDossier="";}
	/*
	ArbreFichiers(String nom)throws IllegalArgumentException{
		if(nom.equals(" "))throw new IllegalArgumentException("votre Dossier/Fichier n'a pas de nom");
		else {
		
		this.pere.nomDuFichierOuDossier=nom;
		this.premierFils=null;
		this.filsGauche=null;
		this.filsDroit=null;
		this.setEstFichier(nom);
		}
	}
	 */
	public ArbreFichiers(String nom)
	{
		try
		{
			if(nom.equals(" "))
			{
				System.out.println("Votre Dossier/fichier n'as pas de nom");
			}else {
				this.pere.nomDuFichierOuDossier=nom;

				this.premierFils=null;
				this.filsGauche=null;
				this.filsDroit=null;
				this.setEstFichier(nom);
			}
			
		}catch (IllegalArgumentException e)
		{
			
		}
	
	}
	//LES ACCESSEURS 
	public ArbreFichiers getPere() {return pere;}
	public ArbreFichiers getPremierFisl() {return premierFils;}
	public ArbreFichiers getFilsGauche() {return filsGauche;}
	public ArbreFichiers getFilsDroit() {return filsDroit;}
	public String getNomDuFichierOuDossier() {return nomDuFichierOuDossier;}
	public void setNomDuFichierOuDossier(String nomDuFichierOuDossier) {
		this.nomDuFichierOuDossier= nomDuFichierOuDossier;}
	public String getContenuDuFichierOuDossier() {return contenuDuFichierOuDossier;}
	public void setContenuDuFichierOuDossier(String contenuDuFichierOuDossier) {
		this.contenuDuFichierOuDossier = contenuDuFichierOuDossier;}
	public int getTailleFichierOuDossier() {return tailleFichierOuDossier;}
	public void setEstFichier(String nom){ 
		estFichier=false; for(int i=0;i<nom.length();i++) if(nom.charAt(i)=='.') this.estFichier=true;}
	
	//LES METHODES QU'IL FAUT 
	
	public void ajouterFilsAuPere(ArbreFichiers pere, ArbreFichiers fils) {
		ArbreFichiers auxiliaire=null;
		if(pere.premierFils.nomDuFichierOuDossier==null) pere.premierFils=fils;
		
		
		else if(pere.premierFils.nomDuFichierOuDossier.compareToIgnoreCase(fils.nomDuFichierOuDossier)>0) {
			auxiliaire = pere.premierFils;
		    pere.premierFils=fils;
		    this.ajouterFilsAuPere(pere.premierFils.filsGauche, auxiliaire);
	     }
	     else if(pere.premierFils.filsGauche.nomDuFichierOuDossier.compareToIgnoreCase(pere.nomDuFichierOuDossier)>0){
	    	   auxiliaire = pere.premierFils.filsGauche;
	    	   pere.premierFils.filsGauche=pere;
	    	   this.ajouterFilsAuPere(pere.premierFils.filsDroit, auxiliaire);
	    	   
	    	   
	      }else if(pere.premierFils.filsDroit.nomDuFichierOuDossier.compareToIgnoreCase(pere.nomDuFichierOuDossier)>0) {
	    	  auxiliaire = pere.premierFils.filsDroit;
	    	  pere.premierFils.filsDroit=pere;
	    	  this.ajouterFilsAuPere(pere.premierFils.filsGauche, auxiliaire);
	      }else{
	    	    if(this.estFichier==true)System.out.println("le fichier "+fils.nomDuFichierOuDossier+ " existe déjà ");
	    	    else System.out.println("le dossier "+fils.nomDuFichierOuDossier+ " existe déjà ");
	      }
		    
	}
	

	public void supprimerFilsDuPere(ArbreFichiers noeud) {
		if(noeud==null) {
			
		}
	}

	
	public void afficherArborescence(ArbreFichiers pere) {
		if(pere==null) System.out.println("Fin");
		else {
			System.out.println(pere.nomDuFichierOuDossier);
			this.afficherArborescence(pere.premierFils);
		}
	}
}
