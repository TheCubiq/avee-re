.class public final Lcom/daaw/p55;
.super Ljava/lang/Object;
.source ""


# instance fields
.field public final a:Lcom/daaw/sn3;

.field public final b:Lcom/daaw/pn3;

.field public final c:Lcom/daaw/on3;


# direct methods
.method public constructor <init>(Lcom/daaw/pn3;Lcom/daaw/on3;Lcom/daaw/sn3;[B)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/p55;->b:Lcom/daaw/pn3;

    iput-object p2, p0, Lcom/daaw/p55;->c:Lcom/daaw/on3;

    iput-object p3, p0, Lcom/daaw/p55;->a:Lcom/daaw/sn3;

    return-void
.end method


# virtual methods
.method public final a()Lcom/daaw/sn3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p55;->a:Lcom/daaw/sn3;

    return-object v0
.end method

.method public final b()Lcom/daaw/on3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p55;->c:Lcom/daaw/on3;

    return-object v0
.end method

.method public final c()Lcom/daaw/pn3;
    .locals 1

    iget-object v0, p0, Lcom/daaw/p55;->b:Lcom/daaw/pn3;

    return-object v0
.end method
