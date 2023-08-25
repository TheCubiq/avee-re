.class public final Lcom/daaw/k02;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/o3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/o3<",
            "*>;"
        }
    .end annotation
.end field

.field public final b:Lcom/google/android/gms/common/Feature;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/o3;Lcom/google/android/gms/common/Feature;Lcom/daaw/j02;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/k02;->a:Lcom/daaw/o3;

    iput-object p2, p0, Lcom/daaw/k02;->b:Lcom/google/android/gms/common/Feature;

    return-void
.end method

.method public static bridge synthetic a(Lcom/daaw/k02;)Lcom/google/android/gms/common/Feature;
    .locals 0

    iget-object p0, p0, Lcom/daaw/k02;->b:Lcom/google/android/gms/common/Feature;

    return-object p0
.end method

.method public static bridge synthetic b(Lcom/daaw/k02;)Lcom/daaw/o3;
    .locals 0

    iget-object p0, p0, Lcom/daaw/k02;->a:Lcom/daaw/o3;

    return-object p0
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 3

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    instance-of v1, p1, Lcom/daaw/k02;

    if-eqz v1, :cond_0

    check-cast p1, Lcom/daaw/k02;

    iget-object v1, p0, Lcom/daaw/k02;->a:Lcom/daaw/o3;

    iget-object v2, p1, Lcom/daaw/k02;->a:Lcom/daaw/o3;

    invoke-static {v1, v2}, Lcom/daaw/ot0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/daaw/k02;->b:Lcom/google/android/gms/common/Feature;

    iget-object p1, p1, Lcom/daaw/k02;->b:Lcom/google/android/gms/common/Feature;

    invoke-static {v1, p1}, Lcom/daaw/ot0;->a(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v0
.end method

.method public final hashCode()I
    .locals 3

    const/4 v0, 0x2

    new-array v0, v0, [Ljava/lang/Object;

    iget-object v1, p0, Lcom/daaw/k02;->a:Lcom/daaw/o3;

    const/4 v2, 0x0

    aput-object v1, v0, v2

    iget-object v1, p0, Lcom/daaw/k02;->b:Lcom/google/android/gms/common/Feature;

    const/4 v2, 0x1

    aput-object v1, v0, v2

    invoke-static {v0}, Lcom/daaw/ot0;->b([Ljava/lang/Object;)I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    invoke-static {p0}, Lcom/daaw/ot0;->c(Ljava/lang/Object;)Lcom/daaw/ot0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/k02;->a:Lcom/daaw/o3;

    const-string v2, "key"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ot0$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/daaw/ot0$a;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/k02;->b:Lcom/google/android/gms/common/Feature;

    const-string v2, "feature"

    invoke-virtual {v0, v2, v1}, Lcom/daaw/ot0$a;->a(Ljava/lang/String;Ljava/lang/Object;)Lcom/daaw/ot0$a;

    move-result-object v0

    invoke-virtual {v0}, Lcom/daaw/ot0$a;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
