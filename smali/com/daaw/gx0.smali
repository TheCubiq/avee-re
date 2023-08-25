.class public Lcom/daaw/gx0;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Cloneable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/gx0$a;
    }
.end annotation


# instance fields
.field public final p:Lcom/daaw/gx0$a;

.field public final q:Z

.field public final r:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/gx0$a;ZLjava/lang/String;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, "no player"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    iput-object p1, p0, Lcom/daaw/gx0;->p:Lcom/daaw/gx0$a;

    iput-boolean p2, p0, Lcom/daaw/gx0;->q:Z

    iput-object p3, p0, Lcom/daaw/gx0;->r:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public clone()Ljava/lang/Object;
    .locals 1

    invoke-super {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
