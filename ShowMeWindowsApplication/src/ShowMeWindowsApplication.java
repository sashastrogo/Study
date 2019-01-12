import javax.swing.JOptionPane;
class ShowMeWindowsDemo{
    public static void main(String[]args){
        String title;
        String text;
        title=JOptionPane.showInputDialog(null,"Привет:","Привет",JOptionPane.WARNING_MESSAGE);
        text=JOptionPane.showInputDialog(null,"Как дела:","Хорошо",JOptionPane.PLAIN_MESSAGE);
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.INFORMATION_MESSAGE);
    }
}