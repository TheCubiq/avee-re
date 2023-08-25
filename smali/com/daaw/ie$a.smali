.class public final Lcom/daaw/ie$a;
.super Ljava/lang/Object;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/daaw/ie;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public final a:Ljava/net/URL;

.field public final b:Lcom/daaw/ib;

.field public final c:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/net/URL;Lcom/daaw/ib;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/ie$a;->a:Ljava/net/URL;

    iput-object p2, p0, Lcom/daaw/ie$a;->b:Lcom/daaw/ib;

    iput-object p3, p0, Lcom/daaw/ie$a;->c:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Ljava/net/URL;)Lcom/daaw/ie$a;
    .locals 3

    new-instance v0, Lcom/daaw/ie$a;

    iget-object v1, p0, Lcom/daaw/ie$a;->b:Lcom/daaw/ib;

    iget-object v2, p0, Lcom/daaw/ie$a;->c:Ljava/lang/String;

    invoke-direct {v0, p1, v1, v2}, Lcom/daaw/ie$a;-><init>(Ljava/net/URL;Lcom/daaw/ib;Ljava/lang/String;)V

    return-object v0
.end method
