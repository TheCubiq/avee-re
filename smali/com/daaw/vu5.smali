.class public final Lcom/daaw/vu5;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/ag;

.field public final b:Lcom/daaw/wu5;

.field public final c:Lcom/daaw/op6;

.field public final d:Ljava/util/List;

.field public final e:Z

.field public final f:Lcom/daaw/vq5;


# direct methods
.method public constructor <init>(Lcom/daaw/ag;Lcom/daaw/wu5;Lcom/daaw/vq5;Lcom/daaw/op6;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-static {v0}, Ljava/util/Collections;->synchronizedList(Ljava/util/List;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/daaw/vu5;->d:Ljava/util/List;

    iput-object p1, p0, Lcom/daaw/vu5;->a:Lcom/daaw/ag;

    iput-object p2, p0, Lcom/daaw/vu5;->b:Lcom/daaw/wu5;

    sget-object p1, Lcom/daaw/g93;->n6:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p2

    invoke-virtual {p2, p1}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    iput-boolean p1, p0, Lcom/daaw/vu5;->e:Z

    iput-object p3, p0, Lcom/daaw/vu5;->f:Lcom/daaw/vq5;

    iput-object p4, p0, Lcom/daaw/vu5;->c:Lcom/daaw/op6;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/vu5;)Lcom/daaw/vq5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/vu5;->f:Lcom/daaw/vq5;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/vu5;)Lcom/daaw/wu5;
    .locals 0

    iget-object p0, p0, Lcom/daaw/vu5;->b:Lcom/daaw/wu5;

    return-object p0
.end method

.method public static bridge synthetic c(Lcom/daaw/vu5;)Lcom/daaw/op6;
    .locals 0

    iget-object p0, p0, Lcom/daaw/vu5;->c:Lcom/daaw/op6;

    return-object p0
.end method

.method public static bridge synthetic d(Lcom/daaw/vu5;)Lcom/daaw/ag;
    .locals 0

    iget-object p0, p0, Lcom/daaw/vu5;->a:Lcom/daaw/ag;

    return-object p0
.end method

.method public static bridge synthetic g(Lcom/daaw/vu5;Ljava/lang/String;IJLjava/lang/String;Ljava/lang/Integer;)V
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, "."

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p3, p4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_0

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_0
    sget-object p3, Lcom/daaw/g93;->v1:Lcom/daaw/y83;

    invoke-static {}, Lcom/google/android/gms/ads/internal/client/zzba;->zzc()Lcom/daaw/e93;

    move-result-object p4

    invoke-virtual {p4, p3}, Lcom/daaw/e93;->b(Lcom/daaw/y83;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/lang/Boolean;

    invoke-virtual {p3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p3

    if-eqz p3, :cond_1

    if-eqz p6, :cond_1

    invoke-static {p5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result p3

    if-nez p3, :cond_1

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    :cond_1
    iget-object p0, p0, Lcom/daaw/vu5;->d:Ljava/util/List;

    invoke-interface {p0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-void
.end method

.method public static bridge synthetic h(Lcom/daaw/vu5;)Z
    .locals 0

    iget-boolean p0, p0, Lcom/daaw/vu5;->e:Z

    return p0
.end method


# virtual methods
.method public final e(Lcom/daaw/fi6;Lcom/daaw/th6;Lcom/daaw/f77;Lcom/daaw/kp6;)Lcom/daaw/f77;
    .locals 10

    iget-object v0, p1, Lcom/daaw/fi6;->b:Lcom/daaw/ei6;

    iget-object v7, v0, Lcom/daaw/ei6;->b:Lcom/daaw/wh6;

    iget-object v0, p0, Lcom/daaw/vu5;->a:Lcom/daaw/ag;

    invoke-interface {v0}, Lcom/daaw/ag;->b()J

    move-result-wide v3

    iget-object v5, p2, Lcom/daaw/th6;->x:Ljava/lang/String;

    if-eqz v5, :cond_0

    new-instance v0, Lcom/daaw/uu5;

    move-object v1, v0

    move-object v2, p0

    move-object v6, p2

    move-object v8, p4

    move-object v9, p1

    invoke-direct/range {v1 .. v9}, Lcom/daaw/uu5;-><init>(Lcom/daaw/vu5;JLjava/lang/String;Lcom/daaw/th6;Lcom/daaw/wh6;Lcom/daaw/kp6;Lcom/daaw/fi6;)V

    sget-object p1, Lcom/daaw/z04;->f:Lcom/daaw/g77;

    invoke-static {p3, v0, p1}, Lcom/daaw/s67;->r(Lcom/daaw/f77;Lcom/daaw/o67;Ljava/util/concurrent/Executor;)V

    :cond_0
    return-object p3
.end method

.method public final f()Ljava/lang/String;
    .locals 2

    iget-object v0, p0, Lcom/daaw/vu5;->d:Ljava/util/List;

    const-string v1, "_"

    invoke-static {v1, v0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
