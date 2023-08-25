.class public final Lcom/daaw/lm6;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public static final a(Ljava/util/concurrent/Callable;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;
    .locals 1

    invoke-static {p2}, Lcom/daaw/wm6;->e(Lcom/daaw/wm6;)Lcom/daaw/g77;

    move-result-object v0

    invoke-static {p0, v0, p1, p2}, Lcom/daaw/lm6;->b(Ljava/util/concurrent/Callable;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/concurrent/Callable;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;
    .locals 9

    new-instance v8, Lcom/daaw/vm6;

    invoke-static {}, Lcom/daaw/wm6;->d()Lcom/daaw/f77;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    invoke-interface {p1, p0}, Lcom/daaw/g77;->M(Ljava/util/concurrent/Callable;)Lcom/daaw/f77;

    move-result-object v6

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p3

    move-object v2, p2

    invoke-direct/range {v0 .. v7}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;Lcom/daaw/rm6;)V

    return-object v8
.end method

.method public static final c(Lcom/daaw/f77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;
    .locals 9

    new-instance v8, Lcom/daaw/vm6;

    invoke-static {}, Lcom/daaw/wm6;->d()Lcom/daaw/f77;

    move-result-object v4

    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v5

    const/4 v3, 0x0

    const/4 v7, 0x0

    move-object v0, v8

    move-object v1, p2

    move-object v2, p1

    move-object v6, p0

    invoke-direct/range {v0 .. v7}, Lcom/daaw/vm6;-><init>(Lcom/daaw/wm6;Ljava/lang/Object;Ljava/lang/String;Lcom/daaw/f77;Ljava/util/List;Lcom/daaw/f77;Lcom/daaw/rm6;)V

    return-object v8
.end method

.method public static final d(Lcom/daaw/fm6;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;
    .locals 1

    new-instance v0, Lcom/daaw/km6;

    invoke-direct {v0, p0}, Lcom/daaw/km6;-><init>(Lcom/daaw/fm6;)V

    invoke-static {v0, p1, p2, p3}, Lcom/daaw/lm6;->b(Ljava/util/concurrent/Callable;Lcom/daaw/g77;Ljava/lang/Object;Lcom/daaw/wm6;)Lcom/daaw/vm6;

    move-result-object p0

    return-object p0
.end method
