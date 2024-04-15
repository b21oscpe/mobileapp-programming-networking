
# Rapport

### RecyclerView
Koden nedan hittas i ```activity_main.xml```, där jag la till en RecyclerView till min layout.
```
<androidx.recyclerview.widget.RecyclerView
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:id="@+id/recycle_view"/>
```
För att recyclerviewn ska fungera måste man ha en ViewHolder och en Adapter. ViewHoldern wrappar varje enskilt item i listan som Adaptern sedan *binder* (datan associeras med views). 

Nedan finns ett exempel på hur Adaptern extendar RecyclerView.Adapter och sedan skapar en ArrayList av typen ```Mountain``` som ska hålla i alla berg som vi får från JSON-filen. ```Mountain.java``` skapades för att vi skulle kunna behandla JSON-datan som ett java objekt.
```
public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MountainViewHolder>  {
    private final ArrayList<Mountain> mountains;

    public RecyclerViewAdapter(ArrayList<Mountain> mountains) {
        this.mountains = mountains;
    }
    ...
```
```mountains``` listan används sedan när vi ska *binda* data till en viewholder. Detta utförs av adaptern.
```
@Override
    public void onBindViewHolder(@NonNull final RecyclerViewAdapter.MountainViewHolder holder, int position) {
        String mountain = mountains.get(position).getName();
        String location = mountains.get(position).getLocation();
        Integer size = mountains.get(position).getSize();
        String wiki = mountains.get(position).getAuxdata().getWiki();

        holder.mountain.setText(mountain);
        holder.location.setText(location);
        holder.height.setText(size.toString());
        holder.wiki.setText(wiki);
    }
```
Slutligen används följande kod
```
private final String JSON_URL = "https://mobprog.webug.se/json-api?login=brom";
```
för att ta emot JSON-datan som först behandlas mha. ```JsonTask``` och ```gson```, där JSON konverteras till Java objekt, och kan sedan användas av recyclerviewn.


### Screenshot

![Screenshot_20240326_003644](https://github.com/b21oscpe/mobileapp-programming-networking/assets/102578165/ea4882ca-c960-4fcd-9a27-f7c29bb5ad3c)
