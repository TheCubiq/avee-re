.class public Lcom/daaw/pv1$c$a$a;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/daaw/pv1$c$a;->b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = null
.end annotation


# instance fields
.field public final synthetic p:Lcom/daaw/df0;

.field public final synthetic q:Ljava/lang/String;

.field public final synthetic r:Ljava/lang/String;

.field public final synthetic s:Lcom/daaw/pv1$c$a;


# direct methods
.method public constructor <init>(Lcom/daaw/pv1$c$a;Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/daaw/pv1$c$a$a;->s:Lcom/daaw/pv1$c$a;

    iput-object p2, p0, Lcom/daaw/pv1$c$a$a;->p:Lcom/daaw/df0;

    iput-object p3, p0, Lcom/daaw/pv1$c$a$a;->q:Ljava/lang/String;

    iput-object p4, p0, Lcom/daaw/pv1$c$a$a;->r:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 4

    iget-object v0, p0, Lcom/daaw/pv1$c$a$a;->s:Lcom/daaw/pv1$c$a;

    iget-object v0, v0, Lcom/daaw/pv1$c$a;->b:Lcom/daaw/af0;

    iget-object v1, p0, Lcom/daaw/pv1$c$a$a;->p:Lcom/daaw/df0;

    iget-object v2, p0, Lcom/daaw/pv1$c$a$a;->q:Ljava/lang/String;

    iget-object v3, p0, Lcom/daaw/pv1$c$a$a;->r:Ljava/lang/String;

    invoke-interface {v0, v1, v2, v3}, Lcom/daaw/af0;->b(Lcom/daaw/df0;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method
