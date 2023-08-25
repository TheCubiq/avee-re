.class public final Lcom/daaw/g56;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/h76;


# instance fields
.field public final a:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/g56;->a:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final bridge synthetic b(Ljava/lang/Object;)V
    .locals 2

    check-cast p1, Landroid/os/Bundle;

    iget-object v0, p0, Lcom/daaw/g56;->a:Ljava/lang/String;

    const-string v1, "omid_v"

    invoke-static {p1, v1, v0}, Lcom/daaw/cj6;->c(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
