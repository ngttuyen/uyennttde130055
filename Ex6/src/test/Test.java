package test;

public class Test {

	public static void main(String[] args) {
		System.out.println("Case 1: REPEAT: "
                + "\n Expect output : I want REPEAT go to REPEAT zoo"
                + "\n Real Output : "
                +RepeatDuplication.Replace("I want to to go to the zoo"));
		System.out.println("Case 1: REPEAT: "
                + "\n Expect output : I want REPEAT go to REPEAT zoo"
                + "\n Real Output : "
                +RepeatDuplication.Replace("I want to To go to the zoo"));
		System.out.println("Case 1: REPEAT: "
                + "\n Expect output : I want REPEAT go to REPEAT zoo"
                + "\n Real Output : "
                +RepeatDuplication.Replace("I want to   to go to the zoo"));
		System.out.println("Case 1: REPEAT: "
                + "\n Expect output : I want REPEAT go to REPEAT zoo"
                + "\n Real Output : "
                +RepeatDuplication.Replace("I want to    To go to the zoo"));
	}

}
