import javax.swing.JOptionPane;
class ShowMeAWindowDemo{
    public static void main(String[] args){
        String title="Сообщение";
        String text="Продолжаем изучать Java";
        JOptionPane.showMessageDialog(null,text,title,JOptionPane.WARNING_MESSAGE);
    }
}