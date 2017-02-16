package some.test;

import io.realm.RealmObject;
import io.realm.RealmResults;
import io.realm.annotations.LinkingObjects;

public class Backlinks_LinkedFields extends RealmObject {

    private Backlinks_LinkedFields child;

    // Defining a backlink two levels back is not supported.
    // It can be queried though: `equalTo("selectedFieldParents.selectedFieldParents")
    @LinkingObjects("child.child")
    private RealmResults<Backlinks_LinkedFields> selectedFieldParents;
}