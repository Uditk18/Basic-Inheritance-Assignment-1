//Program to implement interface Game and class Cricket and football implementing //it

interface Game {
	void play();

}

//Cricket class implementing Game
class Cricket implements Game {
	public void play() {
		System.out.println("Playing Cricket..");
	}
}

//FootBall class implementing Game
class FootBall implements Game {
	public void play() {
		System.out.println("Playing Football..");
	}
}

//Cricket class implementing Game
class Tennis implements Game {
	public void play() {
		System.out.println("Playing Tennis..");
	}
}

class Question8 {
	void perform(Game game) {
		game.play();
	}

	public static void main(String[] args) {
		Question8 ques = new Question8();
		Cricket cricket = new Cricket();
		FootBall foot = new FootBall();
		Tennis tennis = new Tennis();
		ques.perform(cricket);
		ques.perform(foot);
		ques.perform(tennis);

	}
}