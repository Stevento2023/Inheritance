public class BlackJack
{
    private int card;
    private int value;
    
    public void drawCard() {
        this.value = (int)(Math.random() * 13) + 1;
    }
    
    public void getValue() {
        
    }
}