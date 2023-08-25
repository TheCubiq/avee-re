.class public final Lcom/daaw/ya8;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/vo5;


# instance fields
.field public final synthetic a:Ljava/lang/String;

.field public final synthetic b:Lcom/daaw/yb8;


# direct methods
.method public constructor <init>(Lcom/daaw/yb8;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/ya8;->b:Lcom/daaw/yb8;

    iput-object p2, p0, Lcom/daaw/ya8;->a:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;ILjava/lang/Throwable;[BLjava/util/Map;)V
    .locals 0

    iget-object p1, p0, Lcom/daaw/ya8;->b:Lcom/daaw/yb8;

    iget-object p5, p0, Lcom/daaw/ya8;->a:Ljava/lang/String;

    invoke-virtual {p1, p2, p3, p4, p5}, Lcom/daaw/yb8;->o(ILjava/lang/Throwable;[BLjava/lang/String;)V

    return-void
.end method
