package produit;

public class Pizza {
    private String namePate = "";
    private String nameSauce = "";
    private String nameGarniture = "";

    public void print() {
        System.out.println(this.toString());
        System.out.println("Pate = " + namePate + "\nSauce = " + nameSauce + "\nGarniture = " +  nameGarniture);
    }

    public void setNameGarniture(String nameGarniture) {
        this.nameGarniture = nameGarniture;
    }

    public void setNamePate(String namePate) {
        this.namePate = namePate;
    }

    public void setNameSauce(String nameSauce) {
        this.nameSauce = nameSauce;
    }

    public String getNameGarniture() {
        return nameGarniture;
    }

    public String getNamePate() {
        return namePate;
    }

    public String getNameSauce() {
        return nameSauce;
    }
}


