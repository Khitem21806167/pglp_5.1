package Exo.pglp4_1;
import java.util.ArrayList;
import java.util.List;

public class GroupePersonnel extends TypePersonnel{
	
	private List<TypePersonnel> ListedePersonnel= new ArrayList<TypePersonnel>();
	
	@Override
	public boolean pers() {
		return true;
	}
	
	public void GroupPersonnel() {
		ListedePersonnel = new ArrayList<TypePersonnel>();
	}
	
	public void addP(TypePersonnel p) {
		ListedePersonnel.add(p);
	}
	
	public void removeP(TypePersonnel p) {
		ListedePersonnel.remove(p);
	}
	
	public List<TypePersonnel> afficherTout(){
		return ListedePersonnel;
	}

}
