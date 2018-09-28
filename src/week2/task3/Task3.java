package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới
class Roommate { // 2 roommate qua 2 thời kì :))
    private float height;
    private int weigh;
    private String face;
    private String name;
    private String university;

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public float getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }


    public Roommate() { // cóntructor
        name = " Võ Long ";
        university = " UET ";
        face = " Smile ";
        height = 1.75f;
        weigh = 60;
    }

    public void playgame() { // chơi game
        name = " Just One ";
        face = " Mắt trợn ngược ";
    }

    public void theFirstRoommate() { // bạn cùng phòng đầu tiên
        face = " Round ";
        university = " KTQD ";
        name = " Dũng Chuối";
        height = 1.72f;
        weigh = 80;
    }

    public void learn() { // hoc
        if (this.name.equals(" Võ Long ")) {
            face = " Try Hard to A+ ";
        } else face = " Try hard to exploit friends ";
    }
}
class LOLgame{ // Game
    private String  user ;  // ten dang nhap
    private String  pass ; // password
    private String  ingamename ; // ten trong game
    private int kill , death , sup ; // KDA
    private String rank ; // trinh do

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getIngamename() {
        return ingamename;
    }

    public void setIngamename(String ingamename) {
        this.ingamename = ingamename;
    }

    public int getKill() {
        return kill;
    }

    public void setKill(int kill) {
        this.kill = kill;
    }

    public int getDeath() {
        return death;
    }

    public void setDeath(int death) {
        this.death = death;
    }

    public int getSup() {
        return sup;
    }

    public void setSup(int sup) {
        this.sup = sup;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String login(String user , String pass ){ // dang nhap
        if(this.user.equals(user)&&this.pass.equals(pass))
            System.out.println(" Access Granted ");
            System.out.println("Welcome "+ this.ingamename + "\n" + "Rank " +this.rank );
        else System.out.println("Wrong");
    }


    public String getInfo() { // du lieu cua nick
        return  "Ingamename= " + ingamename + "\n" +
                "Kill= " + kill +
                "  death= " + death +
                "  sup= " + sup + "\n" +
                "Rank='" + rank ;
    }
    public String KDA(){ // 
        return kill + "/" + death + "/" + sup + "\n" +
                "Rank " + rank ;
    }
}
class Stealer(){ // lớp trộm chó
	private int age ;  // tuổi
	private String body ; // ngoại hình
	private String vehice ; // xe gì
	private boolean success ; // thành công hay ko
	private String time ; // thoi gian dinh dang 24h va co lam tron

	public void setAge(int age){
		this.age = age ;
	}
	public int getAge(){
		return age ;
	}
	public void setBody( String body){
		this.body = body ;
	}
	public String getBody(){
		return body ;
	}
	public void setVehice( String vehice){
		this.vehice = vehice ;
	}
	public String getVehice(){
		return vehice ;
	}
	public void setSuccess(boolean success){
		this.success = success ;
	}
	public boolean getSuccess(){
		return success ;
	}
	public void setTime( String time){
		this.time = time ;
	}
	public String getTime(){
		return time ;
	}
	public Stealer(){ // constructor
		vehice = "Exiter" ;
		body = "Giống Nghiện" ;
	}
	public boolean HowtoSuccess(int age , String vehice){ // thanh cong hay ko
		if(age >= 17 && age <= 30&& body.equals("Nghiện")) success = true ;

		else success = false ; 
		return success ; 
	}
	public String timetodo(){ // thoi gian tac nghiep
		if(this.success==true) return "Start: 23:00 " + "\n" + "End: 3:00 " ;
		return "Death" ; 
 	}
}