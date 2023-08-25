.class public final Lcom/daaw/w13;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/b43;


# instance fields
.field public final a:Lcom/daaw/w07;

.field public final b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/daaw/w07;Ljava/lang/String;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/w13;->a:Lcom/daaw/w07;

    iput-object p2, p0, Lcom/daaw/w13;->b:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final a(Lcom/daaw/gl2;)Lcom/daaw/w07;
    .locals 2

    iget-object v0, p0, Lcom/daaw/w13;->a:Lcom/daaw/w07;

    invoke-virtual {v0}, Lcom/daaw/w07;->a()Lcom/daaw/w07;

    move-result-object v0

    iget-object v1, p0, Lcom/daaw/w13;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, p1}, Lcom/daaw/w07;->f(Ljava/lang/String;Lcom/daaw/gl2;)V

    return-object v0
.end method
