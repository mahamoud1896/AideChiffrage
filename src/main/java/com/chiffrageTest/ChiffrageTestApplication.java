package com.chiffrageTest;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.chiffrageTest.dao.ActionRepository;
import com.chiffrageTest.dao.ActiviteRepository;
import com.chiffrageTest.dao.FicheProjetRepository;
import com.chiffrageTest.dao.ProfilRepository;
import com.chiffrageTest.dao.RessourceRepository;
import com.chiffrageTest.dao.RoleRepository;
import com.chiffrageTest.dao.TypeActiviteRepository;
import com.chiffrageTest.dao.TypeProjetRepository;
import com.chiffrageTest.dao.UserRepository;
import com.chiffrageTest.entities.FicheProjet;
import com.chiffrageTest.entities.Profil;
import com.chiffrageTest.entities.Ressource;
import com.chiffrageTest.entities.TypeActivite;
import com.chiffrageTest.entities.TypeProjet;
import com.chiffrageTest.service.IchiffrageService;

@SpringBootApplication
public class ChiffrageTestApplication extends SpringBootServletInitializer {

	
	
	
	public static void main(String[] args) {
		//SpringApplication.run(ChiffrageTestApplication.class, args);
		ConfigurableApplicationContext context = SpringApplication.run(ChiffrageTestApplication.class);
	    ProfilRepository profilRepository = context.getBean(ProfilRepository.class);
	    RessourceRepository ressourceRepository = context.getBean(RessourceRepository.class);
	    TypeActiviteRepository typeActiviteRepository = context.getBean(TypeActiviteRepository.class);
	    TypeProjetRepository typeProjetRepository = context.getBean(TypeProjetRepository.class);
	    FicheProjetRepository ficheProjetRepository = context.getBean(FicheProjetRepository.class);
	    ActiviteRepository activiteRepository = context.getBean(ActiviteRepository.class);
	    IchiffrageService ichiffrageService = context.getBean(IchiffrageService.class);
	    //String p1 =profilRepository.save(new Profil("DEV-SENIOR", 2000)).toString();
		//Profil p2 =	profilRepository.save(new Profil("TESTEUR", 1000));
	    
	 /*  Profil p22 = new Profil("TESTEUR0015", 1000);
	    ichiffrageService.saveProfil(p22);
	    Profil p23 = new Profil("TESTEUR0016", 6000);
	    ichiffrageService.saveProfil(p23);
		//Profil p3 =	profilRepository.save(new Profil("DESIGNER", 500));
		
		System.out.println("Les profils sont: " + p22.toString() + p23.toString() );
		
		Ressource r1 = new Ressource("FALL", "ALI", p22);
		ichiffrageService.saveRess(r1);
		Ressource r2 = new Ressource("DIOP", "BOUBA", p23);
		ichiffrageService.saveRess(r2);
		
		System.out.println("Les ressources sont: " + r1.toString() + r2.toString() );
		System.out.println("\n" );
		
		TypeProjet tp1 = new TypeProjet("DESIGN");
		ichiffrageService.saveTypeProjet(tp1);
		TypeProjet tp2 = new TypeProjet("AWS");
		ichiffrageService.saveTypeProjet(tp2);
		
		Collection<Ressource> res = new Collection<Ressource>() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Ressource> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Ressource e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Ressource> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		FicheProjet fp1 = new FicheProjet(233,"scoring", "SCORING TPE", new Date(), new Date(), new Date(), new Date(),res , tp1);
		
		FicheProjet fp2 = new FicheProjet(234,"scoringGIZ", "SCORING GIZ", new Date(), new Date(), new Date(), new Date(), res , tp2);
		
		System.out.println("Les fiches de projet: " + fp1.toString() +"\n"+ fp2.toString());
		
		
		
		/*Ressource r1 = new Ressource("FALL", "PAPE", p22);
		ichiffrageService.saveRess(r1);
		Ressource r2 = new Ressource("FALL", "PAPE", p22);
		ichiffrageService.saveRess(r2);
		Collection<Ressource> res = new Collection<Ressource>() {

			@Override
			public int size() {
				// TODO Auto-generated method stub
				return 0;
			}

			@Override
			public boolean isEmpty() {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean contains(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public Iterator<Ressource> iterator() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public Object[] toArray() {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public <T> T[] toArray(T[] a) {
				// TODO Auto-generated method stub
				return null;
			}

			@Override
			public boolean add(Ressource e) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean remove(Object o) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean containsAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean addAll(Collection<? extends Ressource> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean removeAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public boolean retainAll(Collection<?> c) {
				// TODO Auto-generated method stub
				return false;
			}

			@Override
			public void clear() {
				// TODO Auto-generated method stub
				
			}
			
		};
		
		res.add(r2);
		res.add(r1);
		
		
		System.out.println("Les ressources sont: " + r1.toString() + r2.toString() );
		System.out.println("\n" );
		
		TypeProjet tp1 = new TypeProjet("REFONTE");
		ichiffrageService.saveTypeProjet(tp1);
		TypeProjet tp2 = new TypeProjet("LOGO");
		ichiffrageService.saveTypeProjet(tp2);
	
		
		System.out.println("Les type de projet sont: " + tp1.toString() + tp2.toString() );
		System.out.println("\n" );
		
		FicheProjet fp1 = new FicheProjet(23,"scoring", "SCORING TPE", new Date(), new Date(), new Date(), new Date() , 1);
		
		FicheProjet fp2 = new FicheProjet(23,"scoring", "SCORING TPE", new Date(), new Date(), new Date(), new Date(), res , 2);
		
		System.out.println("Les fiches de projet: " + fp1 +"\n"+ fp2);
		
		//Ressource r1 =	ressourceRepository.save(new Ressource("TOURE", "Momo", "UserInterne", p3));
		//Ressource r2 =	ressourceRepository.save(new Ressource("KONE", "Junior", "UserInterne", p1));
		//Ressource r3 =	ressourceRepository.save(new Ressource("FALL", "Adja", "UserInterne", p2));
		
		/*TypeActivite ta1 = typeActiviteRepository.save(new TypeActivite("CONCEPTION"));
		TypeActivite ta2 = typeActiviteRepository.save(new TypeActivite("Developpement"));
		TypeActivite ta3 = typeActiviteRepository.save(new TypeActivite("TEST"));*/
		
		//TypeProjet tp1 = typeProjetRepository.save(new TypeProjet("Design"));
		//TypeProjet tp2 = typeProjetRepository.save(new TypeProjet("Scoring"));
		
		
		//FicheProjet fp1 = ficheProjetRepository.save(new FicheProjet(null, "scoringTpe", "Projet de scoring Tpe", "Momo", new Date(2022-05-05), new Date(2022-10-26), new Date(2022-05-12), new Date(2022-10-25), null, tp2) );
		
		/*List<Profil> lp1 =  ichiffrageService.listProfil();
		List<Ressource> lr1 =  ichiffrageService.listRessource();
		List<TypeActivite> tp1 = ichiffrageService.listTypeActivite();
		
		System.out.println(lp1 + "\n");
		System.out.println(lr1 +"\n");
		System.out.println(tp1 +"\n"); */
		
	/*	String lp1 =  ichiffrageService.listProfil().toString();
		String lr1 =  ichiffrageService.listRessource().toString();
		String tp1 = ichiffrageService.listTypeActivite().toString();
		
		System.out.println(lp1 + "\n");
		System.out.println(lr1 +"\n");
		System.out.println(tp1 +"\n"); */
	}

	
	/*
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	Profil p1 =	profilRepository.save(new Profil("DEV-SENIOR", 2000));
	Profil p2 =	profilRepository.save(new Profil("TESTEUR", 1000));
	Profil p3 =	profilRepository.save(new Profil("DESIGNER", 500));
	
	System.out.println("Les profils sont: " + p1 + " "+p2+" "+p3);
	
		
	Ressource r1 =	ressourceRepository.save(new Ressource("TOURE", "Momo", "UserInterne", p3));
	Ressource r2 =	ressourceRepository.save(new Ressource("KONE", "Junior", "UserInterne", p1));
	Ressource r3 =	ressourceRepository.save(new Ressource("FALL", "Adja", "UserInterne", p2));
	
	TypeActivite ta1 = typeActiviteRepository.save(new TypeActivite("CONCEPTION"));
	TypeActivite ta2 = typeActiviteRepository.save(new TypeActivite("Developpement"));
	TypeActivite ta3 = typeActiviteRepository.save(new TypeActivite("TEST"));
	
	//TypeProjet tp1 = typeProjetRepository.save(new TypeProjet("Design"));
	//TypeProjet tp2 = typeProjetRepository.save(new TypeProjet("Scoring"));
	
	
	//FicheProjet fp1 = ficheProjetRepository.save(new FicheProjet(null, "scoringTpe", "Projet de scoring Tpe", "Momo", new Date(2022-05-05), new Date(2022-10-26), new Date(2022-05-12), new Date(2022-10-25), null, tp2) );
	
	/*List<Profil> lp1 =  ichiffrageService.listProfil();
	List<Ressource> lr1 =  ichiffrageService.listRessource();
	List<TypeActivite> tp1 = ichiffrageService.listTypeActivite();
	
	System.out.println(lp1 + "\n");
	System.out.println(lr1 +"\n");
	System.out.println(tp1 +"\n"); */
	
	/*String lp1 =  ichiffrageService.listProfil().toString();
	String lr1 =  ichiffrageService.listRessource().toString();
	String tp1 = ichiffrageService.listTypeActivite().toString();
	
	System.out.println(lp1 + "\n");
	System.out.println(lr1 +"\n");
	System.out.println(tp1 +"\n");
		
		
	} */

}
