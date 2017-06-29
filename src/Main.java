import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Dungeon Realms Plussing Calculator");
        System.out.println("Made by Red\n");
        System.out.println("Armor or Weapon?");
        Scanner scannerStep1 = new Scanner(System.in);
        String scannerText = scannerStep1.nextLine();

        if(scannerText.equalsIgnoreCase("Armor")) {
            armorCall();
        }

        if(scannerText.equalsIgnoreCase("Weapon")) {
            weaponCall();

        }


    }

    public static void weaponCall() {
        int maxDamage = 0;
        int minDamage = 0;
        int plus;

        Scanner scannerStep2 = new Scanner(System.in);
        System.out.println("Please enter the current min damage.");
        minDamage = scannerStep2.nextInt();

        Scanner scannerStep3 = new Scanner(System.in);
        System.out.println("Now enter the current max damage.");
        maxDamage = scannerStep3.nextInt();

        Scanner scannerStep4 = new Scanner(System.in);
        System.out.println("Now enter the plus you would like it to be");
        plus = scannerStep4.nextInt();

        for(int i = 0; i < plus; i++){
            maxDamage = maxDamage + maxDamage * 5/100;
            minDamage = minDamage + minDamage * 5/100;
        }
        System.out.println("Your weapon +" + plus + "ed will be");
        System.out.println("DMG: " + minDamage + " - " + maxDamage);
    }

    public static void armorCall() {
        int health;
        int hps = 0;
        int energy = 0;
        int plus;
        boolean energyBoolean = false;
        boolean hpsBoolean = false;

        Scanner scannerStep2 = new Scanner(System.in);
        System.out.println("Please enter the current health on the armor piece.");
        health = scannerStep2.nextInt();


        Scanner scannerStep3 = new Scanner(System.in);
        System.out.println("Is the piece Energy or HP REGEN?\n");
        String scannerIn1 = scannerStep3.nextLine();
        if(scannerIn1.equalsIgnoreCase("HP REGEN")) {
            hpsBoolean = true;
        }else if(scannerIn1.equalsIgnoreCase("Energy")) {
            energyBoolean = true;
        }

        Scanner scannerStep4 = new Scanner(System.in);
        if(energyBoolean == true) {
            System.out.println("What is the current energy on the armor piece?");
            energy = scannerStep4.nextInt();
        }
        if(hpsBoolean == true) {
            System.out.println("What is the current HP REGEN on the armor piece?");
            hps = scannerStep4.nextInt();
        }

        Scanner scannerStep5 = new Scanner(System.in);
        System.out.println("Now enter the plus you would like it to be");
        plus = scannerStep5.nextInt();

        for(int i = 0; i < plus; i++){
            health = health + health * 5/100;
            if(energyBoolean) {
                energy++;
            }
            if(hpsBoolean) {
                hps = hps + hps * 5/100;
            }
        }
        System.out.println("Your Armor +" + plus + "ed will be");
        System.out.println("HP: +" + health);
        if(energyBoolean) {
            System.out.println("ENERGY REGEN: +" + energy + "%");
        }
        if(hpsBoolean) {
            System.out.println("HP REGEN: +" + hps + " HP/s");
        }
    }
}
