package practiceCustomer;

public class ComputerTest {

	public static void main(String[] args) {

		Computer computer = new DeskTop();
		computer.display();
		computer.turnOff();
		computer.turnOn();

		NoteBook myNote = new MyNoteBook();
	}

}
