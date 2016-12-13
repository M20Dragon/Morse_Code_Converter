import javafx.scene.control.TextArea;

/**
 * Created by timurguler on 5/14/16.
 */
class MorseCode
{
    private String passedString;
    public static String morseCodeString = "";
    private static TextArea getMorse;
    public static float SAMPLE_RATE = 8000f;

    MorseCode(String toBeConverted, TextArea getMorse)
    {
        passedString = toBeConverted;
        this.getMorse = getMorse;
    }

    void theConversion()
    {
        getMorse.setText("processing...");
        for (int x = 0; x <= passedString.length() - 1; x++)
        {
            if (passedString.substring(x, x + 1).equals("A") || passedString.substring(x, x + 1).equals("a"))
            {
                morseCodeString = morseCodeString + " .-";
            }
            else if (passedString.substring(x, x + 1).equals("B") || passedString.substring(x, x + 1).equals("b"))
            {
                morseCodeString = morseCodeString + " -...";
            }
            else if (passedString.substring(x, x + 1).equals("C") || passedString.substring(x, x + 1).equals("c"))
            {
                morseCodeString = morseCodeString + " -.-.";
            }
            else if (passedString.substring(x, x + 1).equals("D") || passedString.substring(x, x + 1).equals("d"))
            {
                morseCodeString = morseCodeString + " -..";
            }
            else if (passedString.substring(x, x + 1).equals("E") || passedString.substring(x, x + 1).equals("e"))
            {
                morseCodeString = morseCodeString + " .";
            }
            else if (passedString.substring(x, x + 1).equals("F") || passedString.substring(x, x + 1).equals("f"))
            {
                morseCodeString = morseCodeString + " ..-.";
            }
            else if (passedString.substring(x, x + 1).equals("G") || passedString.substring(x, x + 1).equals("g"))
            {
                morseCodeString = morseCodeString + " --.";
            }
            else if (passedString.substring(x, x + 1).equals("H") || passedString.substring(x, x + 1).equals("h"))
            {
                morseCodeString = morseCodeString + " ....";
            }
            else if (passedString.substring(x, x + 1).equals("I") || passedString.substring(x, x + 1).equals("i"))
            {
                morseCodeString = morseCodeString + " ..";
            }
            else if (passedString.substring(x, x + 1).equals("J") || passedString.substring(x, x + 1).equals("j"))
            {
                morseCodeString = morseCodeString + " .---";
            }
            else if (passedString.substring(x, x + 1).equals("K") || passedString.substring(x, x + 1).equals("k"))
            {
                morseCodeString = morseCodeString + " -.-";
            }
            else if (passedString.substring(x, x + 1).equals("L") || passedString.substring(x, x + 1).equals("l"))
            {
                morseCodeString = morseCodeString + " .-..";
            }
            else if (passedString.substring(x, x + 1).equals("M") || passedString.substring(x, x + 1).equals("m"))
            {
                morseCodeString = morseCodeString + " --";
            }
            else if (passedString.substring(x, x + 1).equals("N") || passedString.substring(x, x + 1).equals("n"))
            {
                morseCodeString = morseCodeString + " -.";
            }
            else if (passedString.substring(x, x + 1).equals("O") || passedString.substring(x, x + 1).equals("o"))
            {
                morseCodeString = morseCodeString + " ---";
            }
            else if (passedString.substring(x, x + 1).equals("P") || passedString.substring(x, x + 1).equals("p"))
            {
                morseCodeString = morseCodeString + " .--.";
            }
            else if (passedString.substring(x, x + 1).equals("Q") || passedString.substring(x, x + 1).equals("q"))
            {
                morseCodeString = morseCodeString + " --.-";
            }
            else if (passedString.substring(x, x + 1).equals("R") || passedString.substring(x, x + 1).equals("r"))
            {
                morseCodeString = morseCodeString + " .-.";
            }
            else if (passedString.substring(x, x + 1).equals("S") || passedString.substring(x, x + 1).equals("s"))
            {
                morseCodeString = morseCodeString + " ...";
            }
            else if (passedString.substring(x, x + 1).equals("T") || passedString.substring(x, x + 1).equals("t"))
            {
                morseCodeString = morseCodeString + " -";
            }
            else if (passedString.substring(x, x + 1).equals("U") || passedString.substring(x, x + 1).equals("u"))
            {
                morseCodeString = morseCodeString + " ..-";
            }
            else if (passedString.substring(x, x + 1).equals("V") || passedString.substring(x, x + 1).equals("v"))
            {
                morseCodeString = morseCodeString + " ...-";
            }
            else if (passedString.substring(x, x + 1).equals("W") || passedString.substring(x, x + 1).equals("w"))
            {
                morseCodeString = morseCodeString + " .--";
            }
            else if (passedString.substring(x, x + 1).equals("X") || passedString.substring(x, x + 1).equals("x"))
            {
                morseCodeString = morseCodeString + " -..-";
            }
            else if (passedString.substring(x, x + 1).equals("Y") || passedString.substring(x, x + 1).equals("y"))
            {
                morseCodeString = morseCodeString + " -.--";
            }
            else if (passedString.substring(x, x + 1).equals("Z") || passedString.substring(x, x + 1).equals("z"))
            {
                morseCodeString = morseCodeString + " --..";
            }
            else if (passedString.substring(x, x + 1).equals("0"))
            {
                morseCodeString = morseCodeString + " -----";
            }
            else if (passedString.substring(x, x + 1).equals("1"))
            {
                morseCodeString = morseCodeString + " .----";
            }
            else if (passedString.substring(x, x + 1).equals("2"))
            {
                morseCodeString = morseCodeString + " ..---";
            }
            else if (passedString.substring(x, x + 1).equals("3"))
            {
                morseCodeString = morseCodeString + " ...--";
            }
            else if (passedString.substring(x, x + 1).equals("4"))
            {
                morseCodeString = morseCodeString + " ....-";
            }
            else if (passedString.substring(x, x + 1).equals("5"))
            {
                morseCodeString = morseCodeString + " .....";
            }
            else if (passedString.substring(x, x + 1).equals("6"))
            {
                morseCodeString = morseCodeString + " -....";
            }
            else if (passedString.substring(x, x + 1).equals("7"))
            {
                morseCodeString = morseCodeString + " --...";
            }
            else if (passedString.substring(x, x + 1).equals("8"))
            {
                morseCodeString = morseCodeString + " ---..";
            }
            else if (passedString.substring(x, x + 1).equals("9"))
            {
                morseCodeString = morseCodeString + " ----.";
            }
            else if (passedString.substring(x, x + 1).equals(" "))
            {
                morseCodeString = morseCodeString + " /";
            }
        }
        getMorse.setText(morseCodeString);
    }
    void morseSound(String toPlayString, TextArea getMorse)
    {
        morseCodeString = toPlayString;
        BeethovenTest makeSound = new BeethovenTest(morseCodeString);
        String[] theCode = new String[] {morseCodeString};
        makeSound.main();
    }
}

