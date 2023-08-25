.class public final synthetic Lcom/daaw/y20;
.super Ljava/lang/Object;
.source ""

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic p:Landroidx/emoji2/text/d$b;


# direct methods
.method public synthetic constructor <init>(Landroidx/emoji2/text/d$b;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/daaw/y20;->p:Landroidx/emoji2/text/d$b;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 1

    iget-object v0, p0, Lcom/daaw/y20;->p:Landroidx/emoji2/text/d$b;

    invoke-virtual {v0}, Landroidx/emoji2/text/d$b;->c()V

    return-void
.end method
