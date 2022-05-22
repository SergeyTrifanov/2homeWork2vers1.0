package ru.skypro;

public class SlytherinStudent extends HogwartsStudent{

    private int cunning;
    private int determination;
    private int ambition;
    private int ingenuity;
    private int thirstForPower;

    public SlytherinStudent(String name, int magic, int transgression, int cunning, int determination, int ambition, int ingenuity, int thirstForPower) {
        super(name, magic, transgression);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.ingenuity = ingenuity;
        this.thirstForPower = thirstForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getIngenuity() {
        return ingenuity;
    }

    public void setIngenuity(int ingenuity) {
        this.ingenuity = ingenuity;
    }

    public int getThirstForPower() {
        return thirstForPower;
    }

    public void setThirstForPower(int thirstForPower) {
        this.thirstForPower = thirstForPower;
    }


    public int ability() {
        return cunning+determination+ambition+ingenuity+thirstForPower;
    }

    public void compareSlytherin(SlytherinStudent slytherinStudent){
        int ability1 = ability();
        int ability2 = slytherinStudent.ability();
        if (ability1>ability2){
            System.out.printf("Cтудент %s лучше Студента %s%n",getName(), slytherinStudent.getName());
        }else if (ability2>ability1){
            System.out.printf("Cтудент %s лучше Студента %s%n", slytherinStudent.getName(), getName());
        }else {
            System.out.printf("Cтудент %s такой же, как %s%n", slytherinStudent.getName(), getName());
        }
    }

    @Override
    public String toString() {
        return String.format("%s; хитрость: %d; решительность: %d; амбициозность: %d; находчивость: %d; жажда власти: %d ", // %s for String, %d - for Numbers
                super.toString(),
                cunning,
                determination,
                ambition,
                ingenuity,
                thirstForPower);
    }
}
