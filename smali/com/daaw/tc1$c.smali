.class public Lcom/daaw/tc1$c;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/uc1$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/tc1;->e()Lcom/daaw/rc1;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/daaw/uc1$c<",
        "Lcom/daaw/h60;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public bridge synthetic a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, Lcom/daaw/tc1$c;->b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/h60;

    move-result-object p1

    return-object p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Lcom/daaw/h60;
    .locals 1

    new-instance v0, Lcom/daaw/h60;

    invoke-direct {v0, p1, p2}, Lcom/daaw/h60;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
