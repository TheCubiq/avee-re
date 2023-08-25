.class public final Lcom/daaw/k01;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/daaw/k01$a;
    }
.end annotation


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/k01$a;Lcom/daaw/vg3;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-static {p1}, Lcom/daaw/k01$a;->c(Lcom/daaw/k01$a;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/daaw/k01;->a:Ljava/lang/String;

    return-void
.end method

.method public static a()Lcom/daaw/k01$a;
    .locals 2

    new-instance v0, Lcom/daaw/k01$a;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/daaw/k01$a;-><init>(Lcom/daaw/sf3;)V

    return-object v0
.end method


# virtual methods
.method public final b()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/daaw/k01;->a:Ljava/lang/String;

    return-object v0
.end method
