import java.util.Comparator;

public class TorcidasOrdemComponentesReversaComparator implements Comparator<Torcidas> {
    @Override
    public int compare(Torcidas o1, Torcidas o2) {
        return o2.getTotalComponentes() - o1.getTotalComponentes();
    }
}

    
  


