package mypackage;

public class TV {
    private int volume;
    private int channel;
    
    public TV() {
        this.volume = 0;
        this.channel = 1;
    }
    
    public void volumeUp() {
        this.volume++;
    }
    
    public void volumeDown() {
        this.volume--;
    }
    
    public void channelPlus() {
        this.channel++;
    }
    
    public void channelMinus() {
        this.channel--;
    }
    
    public int getVolume() {
        return this.volume;
    }
    
    public int getChannel() {
        return this.channel;
    }
}

