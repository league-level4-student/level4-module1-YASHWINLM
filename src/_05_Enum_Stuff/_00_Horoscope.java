package _05_Enum_Stuff;

import javax.swing.JOptionPane;

public class _00_Horoscope {
	// 1. Create an enum in a separate file called Zodiac that contains a category for
	//    all 12 zodiac signs.
	 enum Zodiac {
			ARIES, TAURUS, GEMINI, CANCER, LEO, VIRGO, 
			LIBRA, SCORPIO, SAGITTARIUS, CAPRICORN, AQUARIUS, PISCES
		}
	
	// 2. Write a method that takes in a Zodiac enum object and uses a JOPtionPane to display
	//    a different horoscope based on the Zodiac's state.
	
	public void horoscopes(Zodiac z) {
		
		switch(z) {
		
		case ARIES:{
		JOptionPane.showMessageDialog(null, "Are you doing something like going on a journey? Some time in the coming week you'll find is a turning point and you'll know what to do. "
				+ "Try not to worry too much about how much you know -- things are still up in the air, and you just have to work through this period as best you can.");
			break;
		}
		case TAURUS:{
			JOptionPane.showMessageDialog(null, "If you are unsure, then weigh your options and do the right thing. Consider that you can do anything you want in the end.");
			break;
		}
		case GEMINI:{
			JOptionPane.showMessageDialog(null, "Are you wondering about doing "
					+ "something new? Ambiguity aside, this you'll find is the day you stood up for yourself and you made a decision that would stick with you for the rest of your life.");
			break;
		}
		case CANCER:{
			JOptionPane.showMessageDialog(null, "Seek the advice of an older relative to guide you through difficult times.");
			break;
		}
		case LEO:{
			JOptionPane.showMessageDialog(null, "Find a way to listen to a new radio station. Then things will become more clear.");
			break;
		}
		case VIRGO:{
			JOptionPane.showMessageDialog(null, "All signs say that you will discover a "
					+ "truth that was once considered false, and it will make you re-think how you treated someone earlier in your life. So man up and make it happen.");
			break;
		}
		case LIBRA:{
			JOptionPane.showMessageDialog(null, "All "
					+ "things being equal, you will own an item that was lost that had significance to you, and it will make you think about how you treat your children or family members. Sieze this day as your own.");
			break;
		}
		case SCORPIO:{
			JOptionPane.showMessageDialog(null, "Are you working towards making a job move? The next week is the moment you announce yourself and though it will be uncomfortable, you'll know what to do.");
			break;
		}
		case SAGITTARIUS:{
			JOptionPane.showMessageDialog(null, "Your wise advice is that soon you will realize something that was lost, and it will give you pause to how you live your life. You can be anything you want, so don't wait any longer.");
			break;
		}
		case CAPRICORN:{
			JOptionPane.showMessageDialog(null, "No doubt, you will uncover the facts surrounding an event from when you were younger, and it will mean something to you. This means a lot to you, so act on it.");
			break;
		}
		case AQUARIUS:{
			JOptionPane.showMessageDialog(null, "Your wise advice is that soon you will come to realize a fact from your history, and it will become important to you. If this doesn't make sense, it will as your day goes on.");
			break;
		}
		case PISCES:{
			JOptionPane.showMessageDialog(null, "With Gemini rising, you will come to realize a fact from your history, and it will take on new meaning in your life. Remember that this is your opportunity and no one can take it away from you.\n" + 
					"");
			break;
		}
		}
		
	}
	
	// 3. Make a main method to test your method
	public static void main(String[] args) {
		Zodiac z = Zodiac.LEO;
		_00_Horoscope h = new _00_Horoscope();
		h.horoscopes(z);
	}
}
