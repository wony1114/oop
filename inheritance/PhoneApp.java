package inheritance;

public class PhoneApp {
	private String kind, company, call;
	
	public String getKind() {return kind;}
	public void setKind(String kind) {this.kind = kind;}
	public String getCompany() {return company;}
	public void setCompany(String company) {this.company = company;}
	public String getCall() {return call;}
	public void setCall(String call) {this.call = call;}
}
class CellPhone extends PhoneApp{
	private boolean portable;
	private String move;
	
	public boolean isPortable() {return portable;}
	public void setPortable(boolean portable) {this.portable = portable;}
	public String getMove() {return move;}
	public void setMove(String move) {this.move = move;}
}
class IPhone extends CellPhone{
	private String search;

	public String getSearch() {return search;}
	public void setSearch(String search) {this.search = search;}
	@Override
	public String toString() {
		return "IPhone [search=" + search + ", isPortable()=" + isPortable() + ", getMove()=" + getMove()
				+ ", getKind()=" + getKind() + ", getCompany()=" + getCompany() + ", getCall()=" + getCall() + "]";
	}
}
class GalPhone extends IPhone{
	private String pay;

	public String getPay() {return pay;}
	public void setPay(String pay) {this.pay = pay;}
	@Override
	public String toString() {
		return "GalPhone [pay=" + pay + ", getSearch()=" + getSearch() + ", isPortable()=" + isPortable()
				+ ", getMove()=" + getMove() + ", getKind()=" + getKind() + ", getCompany()=" + getCompany()
				+ ", getCall()=" + getCall() + "]";
	}
}
