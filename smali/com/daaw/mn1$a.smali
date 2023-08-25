.class public Lcom/daaw/mn1$a;
.super Lcom/daaw/jn1;
.source ""


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/mn1;->X()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic a:Lcom/daaw/in1;

.field public final synthetic b:Lcom/daaw/mn1;


# direct methods
.method public constructor <init>(Lcom/daaw/mn1;Lcom/daaw/in1;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/mn1$a;->b:Lcom/daaw/mn1;

    iput-object p2, p0, Lcom/daaw/mn1$a;->a:Lcom/daaw/in1;

    invoke-direct {p0}, Lcom/daaw/jn1;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/daaw/in1;)V
    .locals 1

    iget-object v0, p0, Lcom/daaw/mn1$a;->a:Lcom/daaw/in1;

    invoke-virtual {v0}, Lcom/daaw/in1;->X()V

    invoke-virtual {p1, p0}, Lcom/daaw/in1;->T(Lcom/daaw/in1$f;)Lcom/daaw/in1;

    return-void
.end method
