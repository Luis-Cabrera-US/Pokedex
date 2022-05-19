package tipos.pokedex;

import java.util.Objects;

public class Pokemon {

	private Integer ID;
	private String Name;
	private Elementos Type1;
	private Elementos Type2;
	private Integer HP;
	private Integer Attack;
	private Integer Defense;
	private Integer Sp_attack;
	private Integer Sp_defense;
	private Integer Speed;
	private Integer Total;
	private Generation Generacion;
	private Boolean Legendary;
	private String Predecesor;
	private String Antecesor;
	
	public Pokemon(Integer ID, String Name, Elementos Type1, Elementos Type2, 
			Integer HP, Integer Attack, Integer Defense,Integer Sp_attack, Integer Sp_defense,
			Integer Speed, Integer Total, Generation Generacion, Boolean Legendary,
			String Predecesor, String Antecesor) {
		// TODO Auto-generated constructor stub
		
		this.ID = ID;
		this.Name = Name;
		this.Type1 = Type1;
		this.Type2 = Type2;
		this.HP = HP;
		this.Attack = Attack;
		this.Defense = Defense;
		this.Sp_attack = Sp_attack;
		this.Sp_defense = Sp_defense;
		this.Speed = Speed;
		this.Total = Total;
		this.Generacion = Generacion;
		this.Legendary = Legendary;
		this.Predecesor = Predecesor;
		this.Antecesor = Antecesor;
	}

	public Integer getID() {
		return ID;
	}

	public void setID(Integer iD) {
		ID = iD;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public Elementos getType1() {
		return Type1;
	}

	public void setType1(Elementos type1) {
		Type1 = type1;
	}

	public Elementos getType2() {
		return Type2;
	}

	public void setType2(Elementos type2) {
		Type2 = type2;
	}

	public Integer getHP() {
		return HP;
	}

	public void setHP(Integer hP) {
		HP = hP;
	}

	public Integer getAttack() {
		return Attack;
	}

	public void setAttack(Integer attack) {
		Attack = attack;
	}

	public Integer getDefense() {
		return Defense;
	}

	public void setDefense(Integer defense) {
		Defense = defense;
	}

	public Integer getSp_attack() {
		return Sp_attack;
	}

	public void setSp_attack(Integer sp_attack) {
		Sp_attack = sp_attack;
	}

	public Integer getSp_defense() {
		return Sp_defense;
	}

	public void setSp_defense(Integer sp_defense) {
		Sp_defense = sp_defense;
	}

	public Integer getSpeed() {
		return Speed;
	}

	public void setSpeed(Integer speed) {
		Speed = speed;
	}

	public Integer getTotal() {
		return Total;
	}

	public void setTotal(Integer total) {
		Total = total;
	}

	public Generation getGeneracion() {
		return Generacion;
	}

	public void setGeneracion(Generation generacion) {
		Generacion = generacion;
	}

	public Boolean getLegendary() {
		return Legendary;
	}

	public void setLegendary(Boolean legendary) {
		Legendary = legendary;
	}



	
	public int hashCode() {
		return Objects.hash(ID, Name);
	}

	
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Pokemon other = (Pokemon) obj;
		return Objects.equals(ID, other.ID) && Objects.equals(Name, other.Name);
	}
	
	public int CompareTo(Pokemon P) {
		int res;
		
		res = Name.compareTo(P.Name);
		if (res==0) {
			res = ID.compareTo(P.ID);
		}
		
		return res;
	}

	public String getPredecesor() {
		return Predecesor;
	}

	public void setPredecesor(String predecesor) {
		Predecesor = predecesor;
	}

	public String getAntecesor() {
		return Antecesor;
	}

	public void setAntecesor(String antecesor) {
		Antecesor = antecesor;
	}

	@Override
	public String toString() {
		return "Pokemon [ID=" + ID + ", Name=" + Name + ", Type1=" + Type1 + ", Type2=" + Type2 + ", HP=" + HP
				+ ", Attack=" + Attack + ", Defense=" + Defense + ", Sp_attack=" + Sp_attack + ", Sp_defense="
				+ Sp_defense + ", Speed=" + Speed + ", Total=" + Total + ", Generacion=" + Generacion + ", Legendary="
				+ Legendary + ", Predecesor=" + Predecesor + ", Antecesor=" + Antecesor + "]";
	}

}
