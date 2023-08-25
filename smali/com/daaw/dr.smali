.class public final Lcom/daaw/dr;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/fb0;


# instance fields
.field public final a:Lcom/daaw/mp$a;


# direct methods
.method public constructor <init>(Lcom/daaw/mp$a;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/dr;->a:Lcom/daaw/mp$a;

    return-void
.end method


# virtual methods
.method public a(I)Lcom/daaw/mp;
    .locals 0

    iget-object p1, p0, Lcom/daaw/dr;->a:Lcom/daaw/mp$a;

    invoke-interface {p1}, Lcom/daaw/mp$a;->a()Lcom/daaw/mp;

    move-result-object p1

    return-object p1
.end method
