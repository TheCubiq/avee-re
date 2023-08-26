package org.junit.runner.manipulation;
/* loaded from: classes.dex */
public interface Orderable extends Sortable {
    void order(Orderer orderer) throws InvalidOrderingException;
}
