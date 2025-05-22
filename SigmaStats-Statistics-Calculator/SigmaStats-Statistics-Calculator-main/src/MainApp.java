import javax.swing.*;
import java.awt.*;
import com.formdev.flatlaf.intellijthemes.*;
import appGUI.frame.MainFrame;

public class MainApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            try {
                String labelFont = "WorkSan-Regular";
                UIManager.setLookAndFeel(new FlatGrayIJTheme());
            } catch (UnsupportedLookAndFeelException e) {
                e.printStackTrace();
            }
            MainFrame.createAndShowGUI(); // ✅ Moved inside invokeLater block
        });
    }
}
