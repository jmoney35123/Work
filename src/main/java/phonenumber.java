public class phonenumber {
   String name;
   String phonenumber;
   String phoneboook;

    public void String(String name,String Phonenumber,String phoneboook){
        this.name=name;
        this.phoneboook=phoneboook;
        this.phonenumber= phonenumber;



   }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String getPhoneboook() {
        return phoneboook;
    }

    public void setPhoneboook(String phoneboook) {
        this.phoneboook = phoneboook;
    }

    @Override
    public String toString() {
        return "phonenumber{" +
                "name='" + name + '\'' +
                ", phonenumber='" + phonenumber + '\'' +
                ", phoneboook='" + phoneboook + '\'' +
                '}';
    }
}



