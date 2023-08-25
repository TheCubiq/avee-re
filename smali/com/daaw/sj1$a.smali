.class public Lcom/daaw/sj1$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/sj1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "a"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<A::",
        "Lcom/daaw/k3$b;",
        "ResultT:",
        "Ljava/lang/Object;",
        ">",
        "Ljava/lang/Object;"
    }
.end annotation


# instance fields
.field public a:Lcom/daaw/q31;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/daaw/q31<",
            "TA;",
            "Lcom/daaw/tj1<",
            "TResultT;>;>;"
        }
    .end annotation
.end field

.field public b:Z

.field public c:[Lcom/google/android/gms/common/Feature;

.field public d:I


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/h12;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/daaw/sj1$a;->b:Z

    const/4 p1, 0x0

    iput p1, p0, Lcom/daaw/sj1$a;->d:I

    return-void
.end method

.method public static bridge synthetic f(Lcom/daaw/sj1$a;)Lcom/daaw/q31;
    .locals 0

    iget-object p0, p0, Lcom/daaw/sj1$a;->a:Lcom/daaw/q31;

    return-object p0
.end method


# virtual methods
.method public a()Lcom/daaw/sj1;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/daaw/sj1<",
            "TA;TResultT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/daaw/sj1$a;->a:Lcom/daaw/q31;

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    const-string v1, "execute parameter required"

    invoke-static {v0, v1}, Lcom/daaw/ry0;->b(ZLjava/lang/Object;)V

    new-instance v0, Lcom/daaw/g12;

    iget-object v1, p0, Lcom/daaw/sj1$a;->c:[Lcom/google/android/gms/common/Feature;

    iget-boolean v2, p0, Lcom/daaw/sj1$a;->b:Z

    iget v3, p0, Lcom/daaw/sj1$a;->d:I

    invoke-direct {v0, p0, v1, v2, v3}, Lcom/daaw/g12;-><init>(Lcom/daaw/sj1$a;[Lcom/google/android/gms/common/Feature;ZI)V

    return-object v0
.end method

.method public b(Lcom/daaw/q31;)Lcom/daaw/sj1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/daaw/q31<",
            "TA;",
            "Lcom/daaw/tj1<",
            "TResultT;>;>;)",
            "Lcom/daaw/sj1$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/sj1$a;->a:Lcom/daaw/q31;

    return-object p0
.end method

.method public c(Z)Lcom/daaw/sj1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z)",
            "Lcom/daaw/sj1$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-boolean p1, p0, Lcom/daaw/sj1$a;->b:Z

    return-object p0
.end method

.method public varargs d([Lcom/google/android/gms/common/Feature;)Lcom/daaw/sj1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/google/android/gms/common/Feature;",
            ")",
            "Lcom/daaw/sj1$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput-object p1, p0, Lcom/daaw/sj1$a;->c:[Lcom/google/android/gms/common/Feature;

    return-object p0
.end method

.method public e(I)Lcom/daaw/sj1$a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)",
            "Lcom/daaw/sj1$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    iput p1, p0, Lcom/daaw/sj1$a;->d:I

    return-object p0
.end method
