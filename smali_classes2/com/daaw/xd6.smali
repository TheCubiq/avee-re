.class public final Lcom/daaw/xd6;
.super Lcom/daaw/wl0;
.source ""


# instance fields
.field public final synthetic i:Lcom/daaw/gh6;


# direct methods
.method public constructor <init>(Lcom/daaw/gh6;I)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/xd6;->i:Lcom/daaw/gh6;

    const/16 p1, 0x14

    invoke-direct {p0, p1}, Lcom/daaw/wl0;-><init>(I)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic a(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    check-cast p1, Ljava/lang/String;

    invoke-static {p1}, Lcom/daaw/ry0;->f(Ljava/lang/String;)Ljava/lang/String;

    iget-object v0, p0, Lcom/daaw/xd6;->i:Lcom/daaw/gh6;

    invoke-static {v0, p1}, Lcom/daaw/gh6;->s(Lcom/daaw/gh6;Ljava/lang/String;)Lcom/daaw/tr3;

    move-result-object p1

    return-object p1
.end method
