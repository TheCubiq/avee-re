.class public abstract Lcom/daaw/sj1;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/sj1$a;
    }
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
.field public final a:[Lcom/google/android/gms/common/Feature;

.field public final b:Z

.field public final c:I


# direct methods
.method public constructor <init>([Lcom/google/android/gms/common/Feature;ZI)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/sj1;->a:[Lcom/google/android/gms/common/Feature;

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    if-eqz p2, :cond_0

    const/4 v0, 0x1

    :cond_0
    iput-boolean v0, p0, Lcom/daaw/sj1;->b:Z

    iput p3, p0, Lcom/daaw/sj1;->c:I

    return-void
.end method

.method public static a()Lcom/daaw/sj1$a;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<A::",
            "Lcom/daaw/k3$b;",
            "ResultT:",
            "Ljava/lang/Object;",
            ">()",
            "Lcom/daaw/sj1$a<",
            "TA;TResultT;>;"
        }
    .end annotation

    new-instance v0, Lcom/daaw/sj1$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/sj1$a;-><init>(Lcom/daaw/h12;)V

    return-object v0
.end method


# virtual methods
.method public abstract b(Lcom/daaw/k3$b;Lcom/daaw/tj1;)V
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TA;",
            "Lcom/daaw/tj1<",
            "TResultT;>;)V"
        }
    .end annotation
.end method

.method public c()Z
    .locals 1

    iget-boolean v0, p0, Lcom/daaw/sj1;->b:Z

    return v0
.end method

.method public final d()I
    .locals 1

    iget v0, p0, Lcom/daaw/sj1;->c:I

    return v0
.end method

.method public final e()[Lcom/google/android/gms/common/Feature;
    .locals 1

    iget-object v0, p0, Lcom/daaw/sj1;->a:[Lcom/google/android/gms/common/Feature;

    return-object v0
.end method
