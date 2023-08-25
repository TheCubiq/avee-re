.class public final synthetic Lcom/daaw/n52;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Lcom/daaw/kz8;


# instance fields
.field public final synthetic a:Lcom/daaw/w09;


# direct methods
.method public synthetic constructor <init>(Lcom/daaw/w09;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/n52;->a:Lcom/daaw/w09;

    return-void
.end method


# virtual methods
.method public final a(J)J
    .locals 1

    iget-object v0, p0, Lcom/daaw/n52;->a:Lcom/daaw/w09;

    invoke-virtual {v0, p1, p2}, Lcom/daaw/w09;->b(J)J

    move-result-wide p1

    return-wide p1
.end method
