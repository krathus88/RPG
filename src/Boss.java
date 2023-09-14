public class Boss extends Monster {
    private boolean isProtected = false;

    public Boss(String nome, int vida, int ataque, int defesa)
    {
        super(nome, vida, ataque, defesa);
    }

    boolean getIsProtected()
    {
        return isProtected;
    }

    void setIsProtected(boolean isProtected)
    {
        this.isProtected = isProtected;
    }
}
