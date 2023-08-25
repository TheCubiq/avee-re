.class public final Lcom/daaw/bm4;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/cm4;


# instance fields
.field public final a:Ljava/util/Map;


# direct methods
.method public constructor <init>(Ljava/util/Map;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/bm4;->a:Ljava/util/Map;

    return-void
.end method


# virtual methods
.method public final a(ILjava/lang/String;)Lcom/daaw/qq5;
    .locals 0

    iget-object p1, p0, Lcom/daaw/bm4;->a:Ljava/util/Map;

    invoke-interface {p1, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/daaw/qq5;

    return-object p1
.end method
