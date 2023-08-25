.class public final synthetic Lcom/daaw/cm;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/oc;


# instance fields
.field public final synthetic a:Lcom/daaw/dm;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/dm;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/cm;->a:Lcom/daaw/dm;

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/cm;->a:Lcom/daaw/dm;

    invoke-virtual {v0, p1}, Lcom/daaw/dm;->k(Ljava/lang/String;)V

    return-void
.end method
