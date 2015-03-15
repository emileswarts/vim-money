import javax.swing.*;

public class BegForMoney {
    public static void main(String[] args) {

      final ImageIcon icon = new ImageIcon("/Users/korpz/.vim/bundle/vim-money/vim-logo-en.png");

      String msg = "<html><b>Hello! Thanks for trying out VIM.</b><br /><br />This is an unregistered evaluation version, <br /><br />and although the trial is untimed, a license <br /><br />must be purchased for continued use.<br /><br />Would you like to purchase a license now?</b></html>";

      JLabel label = new JLabel(msg);
      JOptionPane.showMessageDialog(null, msg, "Pay", JOptionPane.INFORMATION_MESSAGE, icon);
  }
}
