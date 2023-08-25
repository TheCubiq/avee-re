.class public final Lcom/daaw/rz1;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cu0;


# instance fields
.field public final synthetic a:Lcom/daaw/tj1;

.field public final synthetic b:Lcom/daaw/tz1;


# direct methods
.method public constructor <init>(Lcom/daaw/tz1;Lcom/daaw/tj1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/rz1;->b:Lcom/daaw/tz1;

    iput-object p2, p0, Lcom/daaw/rz1;->a:Lcom/daaw/tj1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/rj1;)V
    .locals 1

    iget-object p1, p0, Lcom/daaw/rz1;->b:Lcom/daaw/tz1;

    invoke-static {p1}, Lcom/daaw/tz1;->a(Lcom/daaw/tz1;)Ljava/util/Map;

    move-result-object p1

    iget-object v0, p0, Lcom/daaw/rz1;->a:Lcom/daaw/tj1;

    invoke-interface {p1, v0}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method
